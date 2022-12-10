package com.example.mymemesapp.data

import com.example.mymemesapp.constants.*
import com.squareup.moshi.Json

data class Memes(
    @Json(name = DATA)
    val data: Data,
    @Json(name = SUCCESS)
    val success: Boolean
)