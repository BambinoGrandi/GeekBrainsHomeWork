package com.grandi.bambino.wordtolearn.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/grandi/bambino/wordtolearn/interactor/IMainInteractor;", "T", "", "getData", "Lio/reactivex/Single;", "word", "", "isOnline", "", "app_debug"})
public abstract interface IMainInteractor<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<T> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isOnline);
}