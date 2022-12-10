package com.example.mymemesapp.data

import com.squareup.moshi.Json

data class Memes(
    @Json(name=DATA)
    val data: Data,
    @Json(name = SUCCESS)
    val success: Boolean
){
    companion object{
        const val SUCCESS = "success"
        const val DATA = "data"
    }
}