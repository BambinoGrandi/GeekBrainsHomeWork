package com.grandi.bambino.wordtolearn.model.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Translation(
    @field:SerializedName("text")
    val translation: String?
) {

}
