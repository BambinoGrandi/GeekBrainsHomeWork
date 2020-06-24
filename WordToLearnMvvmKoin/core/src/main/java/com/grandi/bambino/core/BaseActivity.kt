package com.grandi.bambino.core


import androidx.appcompat.app.AppCompatActivity
import com.grandi.bambino.core.viewmodel.BaseViewModel
import com.grandi.bambino.model.AppState


abstract class BaseActivity<T : AppState> : AppCompatActivity() {

    abstract val viewModel: BaseViewModel<T>

    abstract fun renderData(model: AppState)

}