package com.grandi.bambino.wordtolearn.model.source

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

class RoomDataBase : IDataSource<List<SearchResult>> {
    override suspend fun getData(word: String): List<SearchResult> {
        TODO("not implemented") // To change body of created functions use File
        // | Settings | File Templates.

    }
}