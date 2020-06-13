package com.grandi.bambino.wordtolearn.interactor

import io.reactivex.Single

interface IMainInteractor<T> {

    suspend fun getData(word: String, isOnline: Boolean) : T

}