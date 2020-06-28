package com.grandi.bambino.repository_main.api

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("words/search")
    fun searchAsync(@Query("search") word: String) : Deferred<List<com.grandi.bambino.model.model.data.SearchResult>>
}