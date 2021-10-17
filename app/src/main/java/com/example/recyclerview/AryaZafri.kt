package com.example.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AryaZafri(
    val imgAryaZafri: Int,
    val nameAryaZafri: String,
    val descAryaZafri: String,
) : Parcelable
