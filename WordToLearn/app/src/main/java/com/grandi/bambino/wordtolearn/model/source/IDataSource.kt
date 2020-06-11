package com.grandi.bambino.wordtolearn.model.source

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

interface IDataSource {

    fun getData(word: String, isOnline: Boolean) : Single<List<SearchResult>>

}