package com.grandi.bambino.wordtolearn.interactor

import com.grandi.bambino.model.AppState
import com.grandi.bambino.model.model.data.SearchResult


class MainInteractor (val repository: com.grandi.bambino.repository.IRepository<List<SearchResult>>) : IMainInteractor<AppState> {
    override suspend fun getData(word: String, isOnline: Boolean) : com.grandi.bambino.model.AppState {
        return AppState.Success(repository.getData(word, isOnline))
    }
}