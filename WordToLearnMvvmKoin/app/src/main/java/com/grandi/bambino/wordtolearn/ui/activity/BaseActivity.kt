package com.grandi.bambino.wordtolearn.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.view.View
import com.grandi.bambino.wordtolearn.viewmodel.BaseViewModel

abstract class BaseActivity<T : AppState> : AppCompatActivity(), View {

    abstract val viewModel: BaseViewModel<T>

    abstract override fun renderData(model: AppState)

}