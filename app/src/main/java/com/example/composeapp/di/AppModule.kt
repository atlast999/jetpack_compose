package com.example.composeapp.di

import com.example.composeapp.repository.ApiService
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class AppModule {
}


object ApiServiceModule {

    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()))
            .build()
            .create(ApiService::class.java)
    }
}