package com.grandi.bambino.repository.room

import com.grandi.bambino.model.model.data.SearchResult
import com.grandi.bambino.repository2.datasource.IDataSource


class RoomDataBase : IDataSource<List<SearchResult>> {
    override suspend fun getData(word: String): List<SearchResult> {
        TODO("not implemented") // To change body of created functions use File
        // | Settings | File Templates.

    }
}