package com.grandi.bambino.model.model.data

import com.google.gson.annotations.SerializedName

class Meanings(
    @field:SerializedName("translation")
    val translation: Translation?,
    @field:SerializedName("transcription")
    val transcription: String?
) {

}
