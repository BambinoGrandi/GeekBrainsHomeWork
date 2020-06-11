package com.grandi.bambino.wordtolearn.model.source

import com.grandi.bambino.wordtolearn.model.data.SearchResult
import io.reactivex.Single

class DataSource(private val localProvider: IDataBase = RoomDataBase(), private val remoteProvider: RetrofitHolder = RetrofitHolder()) :
    IDataSource {

    override fun getData(word: String, isOnline: Boolean): Single<List<SearchResult>> {
        return if (isOnline)
            remoteProvider.getData(word, isOnline)
        else
            localProvider.getData(word, !isOnline)
    }

}
