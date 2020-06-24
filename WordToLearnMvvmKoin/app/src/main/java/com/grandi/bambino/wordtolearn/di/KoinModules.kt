package com.grandi.bambino.wordtolearn.di

import com.grandi.bambino.model.model.data.SearchResult
import com.grandi.bambino.repository2.datasource.DataSourceRemote
import com.grandi.bambino.repository2.datasource.IDataSource
import com.grandi.bambino.repository2.datasource.RetrofitHolder
import com.grandi.bambino.wordtolearn.interactor.MainInteractor

import com.grandi.bambino.wordtolearn.MainViewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val application = module {
    single<IDataSource<List<SearchResult>>>(named(NAME_LOCAL)) {
        com.grandi.bambino.repository.room.DataSourceLocal(
            com.grandi.bambino.repository.room.RoomDataBase()
        )
    }
    single<IDataSource<List<SearchResult>>>(named(NAME_REMOTE)) { DataSourceRemote(
        RetrofitHolder()
    ) }

    single<com.grandi.bambino.repository.IRepository<List<SearchResult>>>(named(NAME_REPOSITORY)) {
        com.grandi.bambino.repository2.Repository(
            get(named(NAME_LOCAL)),
            get(named(NAME_REMOTE))
        )
    }
}
val mainScreen = module {
    factory { MainInteractor(get(named(NAME_REPOSITORY))) }
    factory { MainViewModel(get()) }
}
