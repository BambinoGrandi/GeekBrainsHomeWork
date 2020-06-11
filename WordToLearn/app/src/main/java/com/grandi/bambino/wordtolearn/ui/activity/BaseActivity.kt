package com.grandi.bambino.wordtolearn.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.presenter.IPresenter
import com.grandi.bambino.wordtolearn.view.View

abstract class BaseActivity<T : AppState> : AppCompatActivity(), View {

    lateinit var presenter: IPresenter<T, View>

    abstract fun createPresenter() : IPresenter<T, View>

    abstract override fun renderData(model: AppState)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.detachView(this)
    }
}