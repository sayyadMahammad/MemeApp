package com.example.mymemesapp.dataLayer

import com.example.mymemesapp.api.ApiService
import com.example.mymemesapp.data.Memes
import javax.inject.Inject

interface Repository {
    suspend fun getMemes() : Memes
}


class RepoImp @Inject constructor(val apiService: ApiService) :Repository{
    override suspend fun getMemes(): Memes {
        return apiService.getMemes()
    }
}