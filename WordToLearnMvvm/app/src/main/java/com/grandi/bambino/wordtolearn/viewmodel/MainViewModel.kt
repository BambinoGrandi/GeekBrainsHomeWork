package com.grandi.bambino.wordtolearn.viewmodel

import androidx.lifecycle.LiveData
import com.grandi.bambino.wordtolearn.interactor.MainInteractor
import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.model.source.DataSourceLocal
import com.grandi.bambino.wordtolearn.model.source.DataSourceRemote
import com.grandi.bambino.wordtolearn.repository.Repository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainViewModel @Inject constructor(private val interactor: MainInteractor) : BaseViewModel<AppState>() {

    //Храним последнее состояние Activity
    private var apState : AppState? = null

    fun subscribe(): LiveData<AppState> = liveData

    fun getData(word: String, isOnline: Boolean): LiveData<AppState> {

        compositeDisposable.add(
            interactor.getData(word, isOnline)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    //В случае успеха передаем данные во View через LiveData
                    liveData.value = it
                }, {
                    //В случае ошибки передаем ее через LiveData
                    liveData.value = AppState.Error(it)
                })
        )

        return super.gerData(word, isOnline)
    }

}