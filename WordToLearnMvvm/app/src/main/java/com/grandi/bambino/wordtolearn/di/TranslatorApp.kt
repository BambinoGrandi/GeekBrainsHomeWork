package com.grandi.bambino.wordtolearn.di

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class TranslatorApp : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity>? = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        //Создаеться после сборки приложения
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)

    }
}