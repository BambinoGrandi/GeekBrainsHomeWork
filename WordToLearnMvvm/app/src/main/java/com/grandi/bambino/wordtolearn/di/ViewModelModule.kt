package com.grandi.bambino.wordtolearn.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.grandi.bambino.wordtolearn.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [InteractorModule::class])
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory) : ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    protected abstract fun mainViewModel(mainViewModel: MainViewModel) : ViewModel
}