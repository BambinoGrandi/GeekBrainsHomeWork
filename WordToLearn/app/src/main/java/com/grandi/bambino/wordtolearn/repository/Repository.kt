package com.grandi.bambino.wordtolearn.repository

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.grandi.bambino.wordtolearn.model.source.IDataSource
import io.reactivex.Single


class Repository (private val dataSource: IDataSource): IRepository<List<SearchResult>> {
    override fun getData(word: String, isOnline: Boolean): Single<List<SearchResult>> {
        return dataSource.getData(word, isOnline)
    }
}