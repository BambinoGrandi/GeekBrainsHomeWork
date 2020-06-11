package com.grandi.bambino.wordtolearn.model.source

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

class RoomDataBase : IDataBase {
    override fun getData(word: String, isOnline: Boolean): Single<List<SearchResult>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}