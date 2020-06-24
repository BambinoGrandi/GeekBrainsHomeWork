package com.grandi.bambino.repository

import com.grandi.bambino.model.model.data.SearchResult


interface IRepository<T> {

    suspend fun getData(word: String, isOnline: Boolean) : T

}