package com.grandi.bambino.wordtolearn.viewmodel

import androidx.lifecycle.LiveData
import com.grandi.bambino.wordtolearn.interactor.MainInteractor
import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.model.source.DataSourceLocal
import com.grandi.bambino.wordtolearn.model.source.DataSourceRemote
import com.grandi.bambino.wordtolearn.repository.Repository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

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