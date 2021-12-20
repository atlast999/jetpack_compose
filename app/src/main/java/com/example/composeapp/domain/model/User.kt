package com.example.composeapp.domain.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    @SerializedName(value = "email") @Expose val email: String,
    @SerializedName(value = "password") @Expose val password: String,
) : Parcelable