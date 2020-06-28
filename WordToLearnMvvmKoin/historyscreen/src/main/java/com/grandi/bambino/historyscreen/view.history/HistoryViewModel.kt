package com.grandi.bambino.historyscreen.view.history

import androidx.lifecycle.LiveData
import com.grandi.bambino.core.viewmodel.BaseViewModel
import com.grandi.bambino.historyscreen.parseLocalSearchResults
import com.grandi.bambino.model.AppState
import kotlinx.coroutines.launch


class HistoryViewModel(private val interactor: HistoryInteractor) :
    BaseViewModel<AppState>() {

    private val liveDataForViewToObserve: LiveData<AppState> = liveData

    fun subscribe(): LiveData<AppState> {
        return liveDataForViewToObserve
    }

    override fun getData(word: String, isOnline: Boolean) {

        cancelJob()
        viewModelCoroutineScope.launch { startInteractor(word, isOnline) }
    }

    private suspend fun startInteractor(word: String, isOnline: Boolean) {
        liveData.postValue(parseLocalSearchResults(interactor.getData(word, isOnline)))
    }

    override fun handleError(error: Throwable) {
        liveData.postValue(AppState.Error(error))
    }

    override fun onCleared() {
        liveData.value = AppState.Success(null)
        super.onCleared()
    }
}