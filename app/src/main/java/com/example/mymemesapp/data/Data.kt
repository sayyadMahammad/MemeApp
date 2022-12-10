package com.example.mymemesapp.data

import com.squareup.moshi.Json

data class Data(
    @Json(name = MEMES)
    val memes: List<Meme>
){
    companion object{
        const val MEMES = "memes"
    }
}