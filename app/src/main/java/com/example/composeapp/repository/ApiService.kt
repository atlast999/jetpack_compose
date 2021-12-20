package com.example.composeapp.repository

import com.example.composeapp.domain.model.User
import com.example.composeapp.domain.network.BaseResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST(value = "login")
    suspend fun login(@Body user: User): BaseResponse<Unit>
}