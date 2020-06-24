package com.grandi.bambino.wordtolearn.view

import com.grandi.bambino.model.AppState


interface View{

    fun renderData(model: AppState)

}