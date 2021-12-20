package com.example.composeapp.domain.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName(value = "code") @Expose val code: String,
    @SerializedName(value = "message") @Expose val message: String,
    @SerializedName(value = "data") @Expose val data: T,
)