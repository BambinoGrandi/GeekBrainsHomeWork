package com.grandi.bambino.wordtolearn.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/grandi/bambino/wordtolearn/ui/activity/BaseActivity;", "T", "Lcom/grandi/bambino/wordtolearn/model/AppState;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/grandi/bambino/wordtolearn/view/View;", "()V", "viewModel", "Lcom/grandi/bambino/wordtolearn/viewmodel/BaseViewModel;", "getViewModel", "()Lcom/grandi/bambino/wordtolearn/viewmodel/BaseViewModel;", "renderData", "", "model", "app_debug"})
public abstract class BaseActivity<T extends com.grandi.bambino.wordtolearn.model.AppState> extends androidx.appcompat.app.AppCompatActivity implements com.grandi.bambino.wordtolearn.view.View {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.grandi.bambino.wordtolearn.viewmodel.BaseViewModel<T> getViewModel();
    
    @java.lang.Override()
    public abstract void renderData(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.model.AppState model);
    
    public BaseActivity() {
        super();
    }
}