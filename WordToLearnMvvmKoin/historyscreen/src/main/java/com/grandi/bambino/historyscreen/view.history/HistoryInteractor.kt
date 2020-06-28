package com.grandi.bambino.historyscreen.view.history

import com.grandi.bambino.core.viewmodel.IMainInteractor
import com.grandi.bambino.model.AppState
import com.grandi.bambino.model.model.data.SearchResult
import com.grandi.bambino.repository.IRepository


class HistoryInteractor(
    val repository: IRepository<List<SearchResult>>
) : IMainInteractor<AppState> {

    override suspend fun getData(word: String, isOnline: Boolean) : AppState {
        return AppState.Success(repository.getData(word, isOnline))
    }
}
