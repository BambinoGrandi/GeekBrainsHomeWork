package com.grandi.bambino.wordtolearn.interactor

import com.grandi.bambino.wordtolearn.di.NAME_REPOSITORY
import com.grandi.bambino.wordtolearn.interactor.IMainInteractor
import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.grandi.bambino.wordtolearn.repository.IRepository
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Named

class MainInteractor @Inject constructor(
   @Named(NAME_REPOSITORY) val repository: IRepository<List<SearchResult>>
) : IMainInteractor<AppState> {
    override fun getData(word: String, isOnline: Boolean) : Single<AppState> {
        return repository.getData(word, isOnline).map { AppState.Success(it) }
    }
}