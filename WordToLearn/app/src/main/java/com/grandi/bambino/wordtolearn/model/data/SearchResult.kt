package com.grandi.bambino.wordtolearn.model.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SearchResult(
    @field:SerializedName("text")
    val word: String?,
    @field:SerializedName("meanings")
    val meanings: List<Meanings>?
){

}