package com.grandi.bambino.wordtolearn.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0001\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/grandi/bambino/wordtolearn/di/InteractorModule;", "", "()V", "provideInteractor", "Lcom/grandi/bambino/wordtolearn/interactor/MainInteractor;", "repository", "Lcom/grandi/bambino/wordtolearn/repository/IRepository;", "", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "provideInteractor$app_debug", "app_debug"})
@dagger.Module()
public final class InteractorModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.grandi.bambino.wordtolearn.interactor.MainInteractor provideInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Repository")
    com.grandi.bambino.wordtolearn.repository.IRepository<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> repository) {
        return null;
    }
    
    public InteractorModule() {
        super();
    }
}