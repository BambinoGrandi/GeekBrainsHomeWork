package com.grandi.bambino.wordtolearn.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/grandi/bambino/wordtolearn/viewmodel/MainViewModel;", "Lcom/grandi/bambino/wordtolearn/viewmodel/BaseViewModel;", "Lcom/grandi/bambino/wordtolearn/model/AppState;", "interactor", "Lcom/grandi/bambino/wordtolearn/interactor/MainInteractor;", "(Lcom/grandi/bambino/wordtolearn/interactor/MainInteractor;)V", "apState", "getData", "Landroidx/lifecycle/LiveData;", "word", "", "isOnline", "", "subscribe", "app_debug"})
public final class MainViewModel extends com.grandi.bambino.wordtolearn.viewmodel.BaseViewModel<com.grandi.bambino.wordtolearn.model.AppState> {
    private com.grandi.bambino.wordtolearn.model.AppState apState;
    private final com.grandi.bambino.wordtolearn.interactor.MainInteractor interactor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.grandi.bambino.wordtolearn.model.AppState> subscribe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.grandi.bambino.wordtolearn.model.AppState> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isOnline) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.interactor.MainInteractor interactor) {
        super(null, null);
    }
}