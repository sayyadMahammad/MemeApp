package com.example.mymemesapp.data

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
    @Json(name = NAME )
    val name: String,
    @Json(name = URL)
    val url: String,
    @Json(name = WIDTH )
    val width: Int
){
    companion object{
        const val ID="id"
        const val NAME="name"
        const val URL="url"
        const val WIDTH="width"
        const val HEIGHT="height"
        const val BOX="box_count"
        const val CAPTION="captions"
    }
}