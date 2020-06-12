package com.grandi.bambino.wordtolearn.model.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/grandi/bambino/wordtolearn/model/source/DataSourceLocal;", "Lcom/grandi/bambino/wordtolearn/model/source/IDataSource;", "", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "localProvider", "Lcom/grandi/bambino/wordtolearn/model/source/IDataBase;", "(Lcom/grandi/bambino/wordtolearn/model/source/IDataBase;)V", "getData", "Lio/reactivex/Single;", "word", "", "app_debug"})
public final class DataSourceLocal implements com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<? extends com.grandi.bambino.wordtolearn.model.data.SearchResult>> {
    private final com.grandi.bambino.wordtolearn.model.source.IDataBase localProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
    
    public DataSourceLocal(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.model.source.IDataBase localProvider) {
        super();
    }
    
    public DataSourceLocal() {
        super();
    }
}