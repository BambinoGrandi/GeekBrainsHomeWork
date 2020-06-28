package com.grandi.bambino.historyscreen.di

import com.grandi.bambino.historyscreen.view.history.HistoryInteractor
import com.grandi.bambino.historyscreen.view.history.HistoryViewModel
import org.koin.core.context.loadKoinModules

import org.koin.dsl.module

fun injectDependencies() = loadFeature

private val loadFeature by lazy {
    loadKoinModules(listOf(historyScreen))
}


val historyScreen = module {
    factory { HistoryViewModel(get()) }
    factory { HistoryInteractor(get()) }
}
