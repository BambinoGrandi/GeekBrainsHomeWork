package com.grandi.bambino.wordtolearn.di

import com.grandi.bambino.wordtolearn.interactor.MainInteractor
import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.grandi.bambino.wordtolearn.model.source.*
import com.grandi.bambino.wordtolearn.repository.IRepository
import com.grandi.bambino.wordtolearn.repository.Repository
import com.grandi.bambino.wordtolearn.viewmodel.MainViewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val application = module {
    single<IDataSource<List<SearchResult>>>(named(NAME_LOCAL)) { DataSourceLocal(RoomDataBase()) }
    single<IDataSource<List<SearchResult>>>(named(NAME_REMOTE)) { DataSourceRemote(RetrofitHolder()) }

    single<IRepository<List<SearchResult>>>(named(NAME_REPOSITORY)) {
        Repository(get(named(NAME_LOCAL)), get(named(NAME_REMOTE)))
    }
}
val mainScreen = module {
    factory { MainInteractor(get(named(NAME_REPOSITORY))) }
    factory { MainViewModel(get()) }
}
