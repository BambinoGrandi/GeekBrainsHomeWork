package com.grandi.bambino.historyscreen

import com.grandi.bambino.model.AppState
import com.grandi.bambino.model.model.data.Meanings
import com.grandi.bambino.model.model.data.SearchResult


fun parseLocalSearchResults(data: AppState): AppState {
    return AppState.Success(mapResult(data, false))
}

private fun mapResult(
    data: AppState,
    isOnline: Boolean
): List<SearchResult> {
    val newSearchResults = arrayListOf<SearchResult>()
    when (data) {
        is AppState.Success -> {
            getSuccessResultData(data, isOnline, newSearchResults)
        }
    }
    return newSearchResults
}

private fun getSuccessResultData(
    data: AppState.Success,
    isOnline: Boolean,
    newDataModels: ArrayList<SearchResult>
) {
    val dataModels: List<SearchResult> = data.data as List<SearchResult>
    if (dataModels.isNotEmpty()) {
        if (isOnline) {
            for (searchResult in dataModels) {
                parseOnlineResult(searchResult, newDataModels)
            }
        } else {
            for (searchResult in dataModels) {
                newDataModels.add(SearchResult(searchResult.word, arrayListOf()))
            }
        }
    }
}

private fun parseOnlineResult(dataModel: SearchResult, newDataModels: ArrayList<SearchResult>) {
    if (!dataModel.word.isNullOrBlank() && !dataModel.meanings.isNullOrEmpty()) {
        val newMeanings = arrayListOf<Meanings>()
        for (meaning in dataModel.meanings!!) {
            if (meaning.translation != null && !meaning.translation!!.translation.isNullOrBlank()) {
                newMeanings.add(Meanings(meaning.translation, meaning.transcription))
            }
        }
        if (newMeanings.isNotEmpty()) {
            newDataModels.add(SearchResult(dataModel.word, newMeanings))
        }
    }
}
