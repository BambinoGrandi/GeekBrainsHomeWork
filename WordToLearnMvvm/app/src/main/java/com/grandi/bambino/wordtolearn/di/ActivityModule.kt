package com.grandi.bambino.wordtolearn.di

import com.grandi.bambino.wordtolearn.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity() : MainActivity

}