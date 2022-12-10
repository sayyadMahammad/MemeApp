package com.example.mymemesapp.api

import com.example.mymemesapp.constants.MEME_ENDPOINT
import com.example.mymemesapp.data.Memes
import retrofit2.http.GET

interface ApiService {
    @GET(MEME_ENDPOINT)
    suspend fun getMemes(): Memes
}