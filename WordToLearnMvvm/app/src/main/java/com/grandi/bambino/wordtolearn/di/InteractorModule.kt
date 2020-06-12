package com.grandi.bambino.wordtolearn.di

import com.grandi.bambino.wordtolearn.interactor.MainInteractor
import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.grandi.bambino.wordtolearn.repository.IRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class InteractorModule {

    @Provides
    internal fun provideInteractor(
        @Named(NAME_REPOSITORY) repository: IRepository<List<SearchResult>>
    ) = MainInteractor(repository)
}
