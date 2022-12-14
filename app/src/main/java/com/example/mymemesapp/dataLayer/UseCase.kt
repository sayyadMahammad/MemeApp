package com.example.mymemesapp.dataLayer

import com.example.mymemesapp.data.Memes
import retrofit2.Response
import javax.inject.Inject

class UseCase @Inject constructor(val repository: Repository) {
    suspend fun getMemes(): Memes = repository.getMemes()
}