package com.grandi.bambino.wordtolearn.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lcom/grandi/bambino/wordtolearn/ui/activity/MainActivity;", "Lcom/grandi/bambino/wordtolearn/ui/activity/BaseActivity;", "Lcom/grandi/bambino/wordtolearn/model/AppState;", "()V", "adapter", "Lcom/grandi/bambino/wordtolearn/ui/adapter/MainAdapter;", "observer", "Landroidx/lifecycle/Observer;", "viewModel", "Lcom/grandi/bambino/wordtolearn/viewmodel/MainViewModel;", "getViewModel", "()Lcom/grandi/bambino/wordtolearn/viewmodel/MainViewModel;", "setViewModel", "(Lcom/grandi/bambino/wordtolearn/viewmodel/MainViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$app_debug", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$app_debug", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "renderData", "model", "showError", "showSuccess", "app_debug"})
public final class MainActivity extends com.grandi.bambino.wordtolearn.ui.activity.BaseActivity<com.grandi.bambino.wordtolearn.model.AppState> {
    private com.grandi.bambino.wordtolearn.ui.adapter.MainAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.grandi.bambino.wordtolearn.viewmodel.MainViewModel viewModel;
    private final androidx.lifecycle.Observer<com.grandi.bambino.wordtolearn.model.AppState> observer = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory$app_debug() {
        return null;
    }
    
    public final void setViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.grandi.bambino.wordtolearn.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.viewmodel.MainViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void renderData(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.model.AppState model) {
    }
    
    private final void showSuccess() {
    }
    
    private final void showError() {
    }
    
    public MainActivity() {
        super();
    }
}