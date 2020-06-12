package com.grandi.bambino.wordtolearn.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\nH%\u00a8\u0006\u000b"}, d2 = {"Lcom/grandi/bambino/wordtolearn/di/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/grandi/bambino/wordtolearn/di/ViewModelFactory;", "bindViewModelFactory$app_debug", "mainViewModel", "Landroidx/lifecycle/ViewModel;", "Lcom/grandi/bambino/wordtolearn/viewmodel/MainViewModel;", "app_debug"})
@dagger.Module(includes = {com.grandi.bambino.wordtolearn.di.InteractorModule.class})
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.di.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.grandi.bambino.wordtolearn.viewmodel.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    protected abstract androidx.lifecycle.ViewModel mainViewModel(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.viewmodel.MainViewModel mainViewModel);
    
    public ViewModelModule() {
        super();
    }
}