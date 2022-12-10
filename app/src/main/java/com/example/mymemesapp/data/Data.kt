package com.example.mymemesapp.data

import com.squareup.moshi.Json
import com.example.mymemesapp.constants.*


data class Data(
    @Json(name = MEMES)
    val memes: List<Meme>
)