package com.example.mymemesapp.data

import com.example.mymemesapp.constants.*
import com.squareup.moshi.Json

data class Meme(
    @Json(name = BOX)
    val box_count: Int,
    @Json(name = CAPTION)
    val captions: Int,
    @Json(name = HEIGHT)
    val height: Int,
    @Json(name = ID)
    val id: String,
    @Json(name = NAME)
    val name: String,
    @Json(name = URL)
    val url: String,
    @Json(name = WIDTH)
    val width: Int
)