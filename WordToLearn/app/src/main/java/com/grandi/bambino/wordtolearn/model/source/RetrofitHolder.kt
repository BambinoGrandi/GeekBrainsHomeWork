package com.grandi.bambino.wordtolearn.model.source

import com.google.gson.GsonBuilder
import com.grandi.bambino.wordtolearn.model.data.SearchResult
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Single
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHolder : IDataSource {

    companion object {
        private const val BASE_URL = "https://dictionary.skyeng.ru/api/public/v1/"
    }

    override fun getData(word: String, isOnline: Boolean): Single<List<SearchResult>> {
        return createRetrofit().create(Api::class.java).search(word)
    }

    private fun createRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .client(createOkHttpClient())
        .build()

    private fun createOkHttpClient() : OkHttpClient {
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        return httpClient.build()
    }

}
