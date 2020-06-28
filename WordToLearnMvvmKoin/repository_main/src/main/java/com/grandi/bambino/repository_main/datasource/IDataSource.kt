package com.grandi.bambino.repository_main.datasource

interface IDataSource<T> {

    suspend fun getData(word: String) : T

}