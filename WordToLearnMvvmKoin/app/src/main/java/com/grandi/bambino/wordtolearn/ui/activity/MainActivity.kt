package com.grandi.bambino.wordtolearn.ui.activity

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.grandi.bambino.wordtolearn.R
import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.ui.adapter.MainAdapter
import com.grandi.bambino.wordtolearn.ui.fragments.SearchDialogFragment
import com.grandi.bambino.wordtolearn.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.koin.android.viewmodel.ext.android.viewModel


class MainActivity : BaseActivity<AppState>() {

    private var adapter: MainAdapter? = null

    override lateinit var viewModel: MainViewModel

    private val observer = Observer<AppState>{renderData(it)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModelDelegate : MainViewModel by viewModel()
        viewModel = viewModelDelegate
        viewModel.subscribe().observe(this@MainActivity, Observer<AppState>{
            renderData(it)
        })

        fab.setOnClickListener {
            val searchDialogFragment = SearchDialogFragment.newInstance()
            searchDialogFragment.setSearchClickListener(object :
                SearchDialogFragment.ClickSearchListener {
                override fun onClick(word: String) {
                    //получаем LiveData и подписываемся на изменения, передавая туда observer
                    viewModel.getData(word,true)
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
                else{
                    showSuccess()
                    if (adapter == null){
                        recycler_view_main.layoutManager = LinearLayoutManager(applicationContext)
                        recycler_view_main.adapter = MainAdapter(searchResult)
                    }else
                        adapter!!.getData(searchResult)
                }

            }
            is AppState.Error -> {
                showError()
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

}
