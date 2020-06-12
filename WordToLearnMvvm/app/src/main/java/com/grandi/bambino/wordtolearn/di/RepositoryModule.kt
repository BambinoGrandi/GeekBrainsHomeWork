package com.grandi.bambino.wordtolearn.di

import com.grandi.bambino.wordtolearn.model.AppState
import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.grandi.bambino.wordtolearn.model.source.IDataSource
import com.grandi.bambino.wordtolearn.model.source.RetrofitHolder
import com.grandi.bambino.wordtolearn.model.source.RoomDataBase
import com.grandi.bambino.wordtolearn.repository.IRepository
import com.grandi.bambino.wordtolearn.repository.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton


@Module
class RepositoryModule {

    @Provides
    @Singleton
    @Named(NAME_REPOSITORY)
    internal fun provideRepositoryRemote(
        @Named(NAME_LOCAL) dataSourceLocal: IDataSource<List<SearchResult>>,
        @Named(NAME_REMOTE) dataSourceRemote: IDataSource<List<SearchResult>>) : IRepository<List<SearchResult>> =
        Repository(dataSourceLocal, dataSourceRemote)

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideDataSourceLocal(): IDataSource<List<SearchResult>> = RetrofitHolder()

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideDataSourceRemote(): IDataSource<List<SearchResult>> = RoomDataBase()
}