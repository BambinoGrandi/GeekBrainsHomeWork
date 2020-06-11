package com.grandi.bambino.wordtolearn.presenter

import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.grandi.bambino.wordtolearn.repository.IRepository
import io.reactivex.Single

class MainInteractor(
    private val repository: IRepository<List<SearchResult>>
) : IMainInteractor<AppState> {
    override fun getData(word: String, isOnline: Boolean) : Single<AppState> {
        return repository.getData(word, isOnline).map { AppState.Success(it) }
    }
}