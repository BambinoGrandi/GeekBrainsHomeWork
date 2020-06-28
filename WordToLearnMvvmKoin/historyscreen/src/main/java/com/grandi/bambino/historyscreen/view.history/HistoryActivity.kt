package com.grandi.bambino.historyscreen.view.history

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.grandi.bambino.core.BaseActivity
import com.grandi.bambino.historyscreen.R
import com.grandi.bambino.historyscreen.di.injectDependencies
import com.grandi.bambino.model.AppState
import kotlinx.android.synthetic.main.activity_history.*
import org.koin.android.viewmodel.ext.android.viewModel


class HistoryActivity : BaseActivity<AppState>() {

    override lateinit var viewModel: HistoryViewModel

    private var adapter: HistoryAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        iniViewModel()
        initViews()
    }

    override fun onResume() {
        super.onResume()
        viewModel.getData("", false)
    }


    private fun iniViewModel() {
        if (history_activity_recyclerview.adapter != null) {
            throw IllegalStateException("The ViewModel should be initialised first")
        }
        injectDependencies()
        val viewModelDelegate: HistoryViewModel by viewModel()
        viewModel = viewModelDelegate
        viewModel.subscribe().observe(this@HistoryActivity, Observer<AppState> { renderData(it) })
    }

    private fun initViews() {
        history_activity_recyclerview.adapter = adapter
    }

    override fun renderData(model: AppState) {
        when (model) {
            is AppState.Success -> {
                model.data?.let {
                    if (it.isEmpty()) {

                    } else {
                        if (adapter == null) {
                            history_activity_recyclerview.layoutManager =
                                LinearLayoutManager(applicationContext)
                            history_activity_recyclerview.adapter = HistoryAdapter(it)
                        } else
                            adapter!!.setData(it)
                    }
                }
            }
        }
    }
}
