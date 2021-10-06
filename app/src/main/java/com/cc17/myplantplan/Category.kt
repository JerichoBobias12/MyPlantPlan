package com.cc17.myplantplan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Category(
    val name:String,
    val details:MutableList<Plant>?=null
):Parcelable