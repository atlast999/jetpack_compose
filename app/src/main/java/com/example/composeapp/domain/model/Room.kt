package com.example.composeapp.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Room(
    val id: Long? = null,
    val name: String,
    val available: Int?,
): Parcelable