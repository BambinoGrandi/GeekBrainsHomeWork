package com.grandi.bambino.repository2.datasource

interface IDataSource<T> {

    suspend fun getData(word: String) : T

}