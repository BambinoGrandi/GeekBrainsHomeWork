package com.grandi.bambino.wordtolearn.model.source

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

class DataSourceLocal(private val localProvider: IDataSource<List<SearchResult>> = RoomDataBase()) :
    IDataSource<List<SearchResult>> {

    override suspend fun getData(word: String): List<SearchResult> = localProvider.getData(word)

}
