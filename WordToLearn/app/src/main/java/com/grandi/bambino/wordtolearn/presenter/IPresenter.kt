package com.grandi.bambino.wordtolearn.presenter

import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.view.View

interface IPresenter<T : AppState, V : View> {

    fun attachView(view : V)
    fun detachView(view : V)

    fun getData(word: String, isOnline: Boolean)

}