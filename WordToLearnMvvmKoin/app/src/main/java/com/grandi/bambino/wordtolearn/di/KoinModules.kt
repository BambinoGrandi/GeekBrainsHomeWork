package com.grandi.bambino.wordtolearn.di

import com.grandi.bambino.model.model.data.SearchResult
import com.grandi.bambino.repository.IRepository
import com.grandi.bambino.repository.room.DataSourceLocal
import com.grandi.bambino.repository.room.RoomDataBase
import com.grandi.bambino.repository_main.Repository
import com.grandi.bambino.repository_main.datasource.DataSourceRemote
import com.grandi.bambino.repository_main.datasource.IDataSource
import com.grandi.bambino.repository_main.datasource.RetrofitHolder
import com.grandi.bambino.wordtolearn.MainViewModel
import com.grandi.bambino.wordtolearn.interactor.MainInteractor
import org.koin.core.context.loadKoinModules
import org.koin.core.qualifier.named
import org.koin.dsl.module

fun injectDependencies() = loadModules

private val loadModules by lazy{
    loadKoinModules(listOf(application, mainScreen))
}

val application = module {
//    single<IDataSource<List<SearchResult>>> { DataSourceLocal(RoomDataBase()) }
//    single<IDataSource<List<SearchResult>>> { DataSourceRemote(RetrofitHolder()) }

    single<IRepository<List<SearchResult>>> { Repository(DataSourceLocal(RoomDataBase()), DataSourceRemote(RetrofitHolder())) }
}

val mainScreen = module {
    factory { MainInteractor(get()) }
    factory { MainViewModel(get())}
}
