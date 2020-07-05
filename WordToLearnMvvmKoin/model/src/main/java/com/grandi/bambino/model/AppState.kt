package com.grandi.bambino.model

sealed class AppState {
    data class Success(val data: List<com.grandi.bambino.model.model.data.SearchResult>?) : AppState()
    data class Error(val error: Throwable) : AppState()
}