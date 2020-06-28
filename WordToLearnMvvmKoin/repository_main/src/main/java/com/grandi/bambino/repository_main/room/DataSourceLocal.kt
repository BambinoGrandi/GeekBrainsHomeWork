package com.grandi.bambino.repository.room

import com.grandi.bambino.model.model.data.SearchResult
import com.grandi.bambino.repository_main.datasource.IDataSource


class DataSourceLocal(private val localProvider: IDataSource<List<SearchResult>> = RoomDataBase()) :
    IDataSource<List<SearchResult>> {

    override suspend fun getData(word: String): List<SearchResult> = localProvider.getData(word)

}
