package com.example.mymemesapp.di

import com.example.mymemesapp.api.ApiService
import com.example.mymemesapp.constants.BASE_URL
import com.example.mymemesapp.dataLayer.RepoImp
import com.example.mymemesapp.dataLayer.Repository
import com.squareup.moshi.Moshi
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class Module {


    @Singleton
    @Binds
    abstract fun bindsRepo(repoImp: RepoImp):Repository

    @Singleton
    @Provides
    fun providesMoshi(): MoshiConverterFactory = MoshiConverterFactory.create()


    @Singleton
    @Provides
    fun providesRetrofit(
        moshi: MoshiConverterFactory
    ): Retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(moshi)
        .build()


    @Singleton
    @Provides
    fun providesApiService(
        retrofit: Retrofit
    ): ApiService = retrofit
        .create(ApiService::class.java)

}