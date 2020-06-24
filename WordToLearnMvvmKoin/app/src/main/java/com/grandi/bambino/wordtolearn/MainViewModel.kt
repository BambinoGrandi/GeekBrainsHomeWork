package com.grandi.bambino.wordtolearn

import androidx.lifecycle.LiveData
import com.grandi.bambino.core.viewmodel.BaseViewModel
import com.grandi.bambino.model.AppState
import com.grandi.bambino.wordtolearn.interactor.MainInteractor

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainViewModel (private val interactor: MainInteractor) : BaseViewModel<AppState>() {

    fun subscribe(): LiveData<AppState> = liveData

    override fun getData(word: String, isOnline: Boolean) {
        cancelJob()
        viewModelCoroutineScope.launch { startInteractor(word, isOnline) }
    }

    override fun handleError(error: Throwable) {
        liveData.postValue(AppState.Error(error))
    }

    private suspend fun startInteractor(word: String, isOnline: Boolean) = withContext(Dispatchers.IO) {
        liveData.postValue(interactor.getData(word, isOnline))
    }
}