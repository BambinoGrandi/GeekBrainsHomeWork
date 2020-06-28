package com.grandi.bambino.repository_main.datasource

import com.grandi.bambino.model.model.data.SearchResult

class DataSourceRemote(private val remoteProvider: RetrofitHolder = RetrofitHolder()) :
    IDataSource<List<SearchResult>> {

    override suspend fun getData(word: String): List<SearchResult> = remoteProvider.getData(word)

}