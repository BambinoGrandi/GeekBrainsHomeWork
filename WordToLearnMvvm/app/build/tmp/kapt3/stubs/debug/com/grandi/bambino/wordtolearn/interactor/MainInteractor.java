package com.grandi.bambino.wordtolearn.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/grandi/bambino/wordtolearn/interactor/MainInteractor;", "Lcom/grandi/bambino/wordtolearn/interactor/IMainInteractor;", "Lcom/grandi/bambino/wordtolearn/model/AppState;", "repository", "Lcom/grandi/bambino/wordtolearn/repository/IRepository;", "", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "(Lcom/grandi/bambino/wordtolearn/repository/IRepository;)V", "getRepository", "()Lcom/grandi/bambino/wordtolearn/repository/IRepository;", "getData", "Lio/reactivex/Single;", "word", "", "isOnline", "", "app_debug"})
public final class MainInteractor implements com.grandi.bambino.wordtolearn.interactor.IMainInteractor<com.grandi.bambino.wordtolearn.model.AppState> {
    @org.jetbrains.annotations.NotNull()
    private final com.grandi.bambino.wordtolearn.repository.IRepository<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.grandi.bambino.wordtolearn.model.AppState> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isOnline) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.grandi.bambino.wordtolearn.repository.IRepository<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> getRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainInteractor(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Repository")
    com.grandi.bambino.wordtolearn.repository.IRepository<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> repository) {
        super();
    }
}