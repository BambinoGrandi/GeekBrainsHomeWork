package com.grandi.bambino.wordtolearn.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/grandi/bambino/wordtolearn/di/AppComponent;", "", "inject", "", "englishVocabularyApp", "Lcom/grandi/bambino/wordtolearn/di/TranslatorApp;", "Builder", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.grandi.bambino.wordtolearn.di.InteractorModule.class, com.grandi.bambino.wordtolearn.di.RepositoryModule.class, com.grandi.bambino.wordtolearn.di.ViewModelModule.class, com.grandi.bambino.wordtolearn.di.ActivityModule.class, dagger.android.support.AndroidSupportInjectionModule.class})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.grandi.bambino.wordtolearn.di.TranslatorApp englishVocabularyApp);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/grandi/bambino/wordtolearn/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/grandi/bambino/wordtolearn/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.grandi.bambino.wordtolearn.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.grandi.bambino.wordtolearn.di.AppComponent build();
    }
}