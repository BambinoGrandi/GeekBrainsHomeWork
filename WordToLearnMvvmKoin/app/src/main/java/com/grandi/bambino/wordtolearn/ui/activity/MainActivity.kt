package com.grandi.bambino.wordtolearn.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.InstallState
import com.google.android.play.core.install.InstallStateUpdatedListener
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.AppUpdateType.IMMEDIATE
import com.google.android.play.core.install.model.InstallStatus
import com.google.android.play.core.install.model.UpdateAvailability
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import com.grandi.bambino.core.BaseActivity
import com.grandi.bambino.model.AppState
import com.grandi.bambino.wordtolearn.MainViewModel
import com.grandi.bambino.wordtolearn.R
import com.grandi.bambino.wordtolearn.di.injectDependencies
import com.grandi.bambino.wordtolearn.ui.adapter.MainAdapter
import com.grandi.bambino.wordtolearn.ui.fragments.SearchDialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.koin.android.viewmodel.ext.android.viewModel

private const val HISTORY_ACTIVITY_PATH =
    "com.grandi.bambino.historyscreen.view.history.HistoryActivity"
private const val HISTORY_ACTIVITY_FEATURE_NAME = "historyScreen"
private const val REQUEST_CODE = 44

class MainActivity : BaseActivity<AppState>() {

    private var adapter: MainAdapter? = null

    private lateinit var splitInstallManager: SplitInstallManager

    override lateinit var viewModel: MainViewModel

    private val observer = Observer<AppState> { renderData(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDependencies()
        val viewModelDelegate: MainViewModel by viewModel()
        viewModel = viewModelDelegate
        viewModel.subscribe()
            .observe(this@MainActivity, Observer<com.grandi.bambino.model.AppState> {
                renderData(it)
            })

        fab.setOnClickListener {
            val searchDialogFragment = SearchDialogFragment.newInstance()
            searchDialogFragment.setSearchClickListener(object :
                SearchDialogFragment.ClickSearchListener {
                override fun onClick(word: String) {
                    //получаем LiveData и подписываемся на изменения, передавая туда observer
                    viewModel.getData(word, true)
                }

            })
            searchDialogFragment.show(supportFragmentManager, null)
        }
    }


    override fun renderData(model: AppState) {
        when (model) {
            is AppState.Success -> {
                val searchResult = model.data
                if (searchResult == null || searchResult.isEmpty())
                    showError()
                else {
                    showSuccess()
                    if (adapter == null) {
                        recycler_view_main.layoutManager = LinearLayoutManager(applicationContext)
                        recycler_view_main.adapter = MainAdapter(searchResult)
                    } else
                        adapter!!.getData(searchResult)
                }

            }
            is AppState.Error -> {
                showError()
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_history -> {
                splitInstallManager = SplitInstallManagerFactory.create(applicationContext)
                val request =
                    SplitInstallRequest
                        .newBuilder()
                        .addModule(HISTORY_ACTIVITY_FEATURE_NAME)
                        .build()

                splitInstallManager
                    .startInstall(request)
                    .addOnSuccessListener {
                        val intent = Intent().setClassName(packageName, HISTORY_ACTIVITY_PATH)
                        startActivity(intent)
                    }
                    .addOnFailureListener {
                        Toast.makeText(
                            applicationContext,
                            "Couldn't download feature: " + it.message,
                            Toast.LENGTH_LONG
                        ).show()
                    }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK)
            appUpdateManager.unregisterListener(stateUpdateListener)
        else
            Toast.makeText(
                applicationContext,
                "Update flow failed! Result code: $resultCode",
                Toast.LENGTH_SHORT
            ).show()
    }

    override fun onResume() {
        super.onResume()
        appUpdateManager
            .appUpdateInfo
            .addOnSuccessListener { appUpdateInfo ->
                if (appUpdateInfo.installStatus() == InstallStatus.DOWNLOADED) {
                    popupSnackbarForCompleteUpdate()
                }
                if (appUpdateInfo.updateAvailability()
                    == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS
                ) {
                    appUpdateManager.startUpdateFlowForResult(
                        appUpdateInfo,
                        AppUpdateType.IMMEDIATE,
                        this,
                        REQUEST_CODE
                    )
                }
            }

    }

    private fun showSuccess() {
        success_result.visibility = VISIBLE
        error_result.visibility = GONE
    }

    private fun showError() {
        success_result.visibility = GONE
        error_result.visibility = VISIBLE
    }

    private lateinit var appUpdateManager: AppUpdateManager
    private val stateUpdateListener: InstallStateUpdatedListener = object : InstallStateUpdatedListener{
        override fun onStateUpdate(state: InstallState?) {
            state?.let {
                if(it.installStatus() == InstallStatus.DOWNLOADED) popupSnackbarForCompleteUpdate()
            }
        }

    }

    private fun checkForUpdates() {
        appUpdateManager = AppUpdateManagerFactory.create(applicationContext)
        val appUpdateInfo = appUpdateManager.appUpdateInfo

        appUpdateInfo.addOnSuccessListener { appUpdateIntent ->
            if (appUpdateIntent.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE && appUpdateIntent.isUpdateTypeAllowed(
                    IMMEDIATE
                )
            ) {
                appUpdateManager.registerListener(stateUpdateListener)
                appUpdateManager.startUpdateFlowForResult(
                    appUpdateIntent,
                    IMMEDIATE,
                    this,
                    REQUEST_CODE
                )
            }
        }
    }

    private fun popupSnackbarForCompleteUpdate() {
        Snackbar.make(
            findViewById(R.id.activity_main_layout),
            "An update has just been downloaded.",
            Snackbar.LENGTH_INDEFINITE
        ).apply {
            setAction("RESTART") { appUpdateManager.completeUpdate() }
            show()
        }
    }
}
