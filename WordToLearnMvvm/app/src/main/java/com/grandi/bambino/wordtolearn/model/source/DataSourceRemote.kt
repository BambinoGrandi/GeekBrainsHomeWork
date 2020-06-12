package com.grandi.bambino.wordtolearn.model.source

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

class DataSourceRemote(private val remoteProvider: RetrofitHolder = RetrofitHolder()) :
    IDataSource<List<SearchResult>> {

    override fun getData(word: String): Single<List<SearchResult>> = remoteProvider.getData(word)

}
