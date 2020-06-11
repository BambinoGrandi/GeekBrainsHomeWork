package com.grandi.bambino.wordtolearn.presenter

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

interface IMainInteractor<T> {

    fun getData(word: String, isOnline: Boolean) : Single<T>

}