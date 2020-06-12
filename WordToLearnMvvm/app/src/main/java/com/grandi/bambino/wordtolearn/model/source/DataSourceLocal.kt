package com.grandi.bambino.wordtolearn.model.source

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

class DataSourceLocal(private val localProvider: IDataBase = RoomDataBase()) :
    IDataSource<List<SearchResult>> {

    override fun getData(word: String): Single<List<SearchResult>> = localProvider.getData(word)

}
