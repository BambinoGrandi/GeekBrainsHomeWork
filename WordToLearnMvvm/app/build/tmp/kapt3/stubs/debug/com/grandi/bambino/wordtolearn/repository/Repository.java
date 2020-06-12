package com.grandi.bambino.wordtolearn.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B3\b\u0007\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/grandi/bambino/wordtolearn/repository/Repository;", "Lcom/grandi/bambino/wordtolearn/repository/IRepository;", "", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "localSource", "Lcom/grandi/bambino/wordtolearn/model/source/IDataSource;", "remoteSource", "(Lcom/grandi/bambino/wordtolearn/model/source/IDataSource;Lcom/grandi/bambino/wordtolearn/model/source/IDataSource;)V", "getLocalSource", "()Lcom/grandi/bambino/wordtolearn/model/source/IDataSource;", "getRemoteSource", "getData", "Lio/reactivex/Single;", "word", "", "isOnline", "", "app_debug"})
public final class Repository implements com.grandi.bambino.wordtolearn.repository.IRepository<java.util.List<? extends com.grandi.bambino.wordtolearn.model.data.SearchResult>> {
    @org.jetbrains.annotations.NotNull()
    private final com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> localSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> remoteSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isOnline) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> getLocalSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> getRemoteSource() {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Local")
    com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> localSource, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Remote")
    com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> remoteSource) {
        super();
    }
}