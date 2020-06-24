package com.grandi.bambino.wordtolearn.interactor

interface IMainInteractor<T> {

    suspend fun getData(word: String, isOnline: Boolean) : T

}