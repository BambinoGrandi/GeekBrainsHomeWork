package com.grandi.bambino.wordtolearn.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/grandi/bambino/wordtolearn/viewmodel/BaseViewModel;", "T", "Lcom/grandi/bambino/wordtolearn/model/AppState;", "Landroidx/lifecycle/ViewModel;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Landroidx/lifecycle/MutableLiveData;Lio/reactivex/disposables/CompositeDisposable;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "gerData", "Landroidx/lifecycle/LiveData;", "word", "", "isOnline", "", "onCleared", "", "app_debug"})
public abstract class BaseViewModel<T extends com.grandi.bambino.wordtolearn.model.AppState> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<T> liveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<T> gerData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isOnline) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<T> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
    
    public BaseViewModel() {
        super();
    }
}