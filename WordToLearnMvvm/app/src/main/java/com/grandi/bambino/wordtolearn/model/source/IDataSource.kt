package com.grandi.bambino.wordtolearn.model.source

import io.reactivex.Single

interface IDataSource<T> {

    fun getData(word: String) : Single<T>

}