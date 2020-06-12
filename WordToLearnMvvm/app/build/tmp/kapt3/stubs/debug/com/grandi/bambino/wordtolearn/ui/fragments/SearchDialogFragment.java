package com.grandi.bambino.wordtolearn.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/grandi/bambino/wordtolearn/ui/fragments/SearchDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "clickButtonSearchListener", "Landroid/view/View$OnClickListener;", "clickSearchListener", "Lcom/grandi/bambino/wordtolearn/ui/fragments/SearchDialogFragment$ClickSearchListener;", "searchButton", "Landroid/widget/Button;", "searchNewWord", "Lcom/google/android/material/textfield/TextInputEditText;", "textWatcher", "Landroid/text/TextWatcher;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "setSearchClickListener", "listener", "setSearchClickListener$app_debug", "ClickSearchListener", "Companion", "app_debug"})
public final class SearchDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.google.android.material.textfield.TextInputEditText searchNewWord;
    private android.widget.Button searchButton;
    private com.grandi.bambino.wordtolearn.ui.fragments.SearchDialogFragment.ClickSearchListener clickSearchListener;
    private final android.text.TextWatcher textWatcher = null;
    private final android.view.View.OnClickListener clickButtonSearchListener = null;
    public static final com.grandi.bambino.wordtolearn.ui.fragments.SearchDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setSearchClickListener$app_debug(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.ui.fragments.SearchDialogFragment.ClickSearchListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public SearchDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/grandi/bambino/wordtolearn/ui/fragments/SearchDialogFragment$ClickSearchListener;", "", "onClick", "", "word", "", "app_debug"})
    public static abstract interface ClickSearchListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        java.lang.String word);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/grandi/bambino/wordtolearn/ui/fragments/SearchDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/grandi/bambino/wordtolearn/ui/fragments/SearchDialogFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.grandi.bambino.wordtolearn.ui.fragments.SearchDialogFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}