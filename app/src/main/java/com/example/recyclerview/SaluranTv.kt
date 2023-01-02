package com.example.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SaluranTv(
    var nama : String,
    var deskripsi : String,
    var logo : Int
) : Parcelable
