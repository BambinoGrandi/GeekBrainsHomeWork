package com.grandi.bambino.wordtolearn.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/grandi/bambino/wordtolearn/ui/adapter/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/grandi/bambino/wordtolearn/ui/adapter/MainAdapter$ViewHolder;", "data", "", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "(Ljava/util/List;)V", "getData", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.grandi.bambino.wordtolearn.ui.adapter.MainAdapter.ViewHolder> {
    private java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult> data;
    
    public final void getData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.grandi.bambino.wordtolearn.ui.adapter.MainAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.ui.adapter.MainAdapter.ViewHolder holder, int position) {
    }
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.grandi.bambino.wordtolearn.model.data.SearchResult> data) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/grandi/bambino/wordtolearn/ui/adapter/MainAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "data", "Lcom/grandi/bambino/wordtolearn/model/data/SearchResult;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.grandi.bambino.wordtolearn.model.data.SearchResult data) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}