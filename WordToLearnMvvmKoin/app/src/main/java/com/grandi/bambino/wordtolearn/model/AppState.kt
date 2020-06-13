package com.grandi.bambino.wordtolearn.model

import com.grandi.bambino.wordtolearn.model.data.SearchResult

sealed class AppState {
    data class Success(val data: List<SearchResult>) : AppState()
    data class Error(val error: Throwable) : AppState()
}