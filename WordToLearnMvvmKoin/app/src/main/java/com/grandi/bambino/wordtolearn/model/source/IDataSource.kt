package com.grandi.bambino.wordtolearn.model.source

import io.reactivex.Single

interface IDataSource<T> {

   suspend fun getData(word: String) : T

}