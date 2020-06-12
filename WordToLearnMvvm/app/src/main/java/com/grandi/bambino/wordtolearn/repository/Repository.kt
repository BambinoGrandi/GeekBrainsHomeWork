package com.grandi.bambino.wordtolearn.repository

import com.grandi.bambino.wordtolearn.di.NAME_LOCAL
import com.grandi.bambino.wordtolearn.di.NAME_REMOTE
import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.grandi.bambino.wordtolearn.model.source.IDataSource
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Named


class Repository @Inject constructor(
    @Named(NAME_LOCAL) val localSource: IDataSource<List<SearchResult>>,
    @Named(NAME_REMOTE) val remoteSource: IDataSource<List<SearchResult>>
) : IRepository<List<SearchResult>> {
    override fun getData(word: String, isOnline: Boolean): Single<List<SearchResult>> {
        return if (isOnline) remoteSource.getData(word)
        else localSource.getData(word)
    }
}