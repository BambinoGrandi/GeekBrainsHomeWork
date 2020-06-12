package com.grandi.bambino.wordtolearn.interactor

import io.reactivex.Single

interface IMainInteractor<T> {

    fun getData(word: String, isOnline: Boolean) : Single<T>

}