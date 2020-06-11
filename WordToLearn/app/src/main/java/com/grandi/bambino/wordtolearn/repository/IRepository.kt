package com.grandi.bambino.wordtolearn.repository

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

interface IRepository<T> {

    fun getData(word: String, isOnline: Boolean) : Single<T>

}