package com.grandi.bambino.wordtolearn.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

//Класс для создания ViewModel
@Singleton
class ViewModelFactory @Inject constructor(
    private val viewModels: MutableMap<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val creator = viewModels[modelClass]
            ?: viewModels.asIterable().firstOrNull() { modelClass.isAssignableFrom(it.key) }?.value
            ?: throw IllegalAccessException("unknown model class $modelClass")
        return try {
            creator.get() as T
        }catch (e : Exception) {
            throw RuntimeException(e)
        }
    }
}