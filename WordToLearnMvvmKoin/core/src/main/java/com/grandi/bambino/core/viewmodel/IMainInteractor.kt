package com.grandi.bambino.core.viewmodel

interface IMainInteractor<T> {

    suspend fun getData(word: String, isOnline: Boolean) : T

}