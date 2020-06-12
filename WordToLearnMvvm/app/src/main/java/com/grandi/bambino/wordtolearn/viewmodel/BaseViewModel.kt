package com.grandi.bambino.wordtolearn.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.grandi.bambino.wordtolearn.model.AppState
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel <T : AppState> (
    protected val liveData : MutableLiveData<T> = MutableLiveData(),
    protected val compositeDisposable: CompositeDisposable = CompositeDisposable()
) : ViewModel(){

    open fun gerData(word: String, isOnline: Boolean): LiveData<T> = liveData

    override fun onCleared() {
        compositeDisposable.clear()
    }

}