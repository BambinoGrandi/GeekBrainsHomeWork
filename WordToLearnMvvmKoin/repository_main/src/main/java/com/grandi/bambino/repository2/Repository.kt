package com.grandi.bambino.repository2

import com.grandi.bambino.model.model.data.SearchResult
import com.grandi.bambino.repository.IRepository
import com.grandi.bambino.repository2.datasource.IDataSource


class Repository (
    val localSource: IDataSource<List<SearchResult>>,
    val remoteSource: IDataSource<List<com.grandi.bambino.model.model.data.SearchResult>>
) : IRepository<List<SearchResult>> {
    override suspend fun getData(word: String, isOnline: Boolean): List<com.grandi.bambino.model.model.data.SearchResult> {
        return if (isOnline) remoteSource.getData(word)
        else localSource.getData(word)
    }
}