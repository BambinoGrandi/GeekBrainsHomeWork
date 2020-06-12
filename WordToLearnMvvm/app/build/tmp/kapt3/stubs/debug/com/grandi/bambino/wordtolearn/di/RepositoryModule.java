package com.grandi.bambino.wordtolearn.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0001\u00a2\u0006\u0002\b\u0007J\u0019\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0001\u00a2\u0006\u0002\b\tJE\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0001\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0001\u00a2\u0006\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/grandi/bambino/wordtolearn/di/RepositoryModule;", "", "()V", "provideDataSourceLocal", "Lcom/grandi/bambino/wordtolearn/model/source/IDataSource;", "", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "provideDataSourceLocal$app_debug", "provideDataSourceRemote", "provideDataSourceRemote$app_debug", "provideRepositoryRemote", "Lcom/grandi/bambino/wordtolearn/repository/IRepository;", "dataSourceLocal", "dataSourceRemote", "provideRepositoryRemote$app_debug", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Repository")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.grandi.bambino.wordtolearn.repository.IRepository<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> provideRepositoryRemote$app_debug(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Local")
    com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> dataSourceLocal, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Remote")
    com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> dataSourceRemote) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Remote")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> provideDataSourceLocal$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Local")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> provideDataSourceRemote$app_debug() {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}