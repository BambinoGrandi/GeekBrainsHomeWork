package com.grandi.bambino.wordtolearn.model.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0002J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/grandi/bambino/wordtolearn/model/source/RetrofitHolder;", "Lcom/grandi/bambino/wordtolearn/model/source/IDataSource;", "", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "()V", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "createRetrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getData", "Lio/reactivex/Single;", "word", "", "Companion", "app_debug"})
public final class RetrofitHolder implements com.grandi.bambino.wordtolearn.model.source.IDataSource<java.util.List<? extends com.grandi.bambino.wordtolearn.model.data.SearchResult>> {
    private static final java.lang.String BASE_URL = "https://dictionary.skyeng.ru/api/public/v1/";
    public static final com.grandi.bambino.wordtolearn.model.source.RetrofitHolder.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult>> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
    
    private final retrofit2.Retrofit createRetrofit() {
        return null;
    }
    
    private final okhttp3.OkHttpClient createOkHttpClient() {
        return null;
    }
    
    public RetrofitHolder() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/grandi/bambino/wordtolearn/model/source/RetrofitHolder$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}