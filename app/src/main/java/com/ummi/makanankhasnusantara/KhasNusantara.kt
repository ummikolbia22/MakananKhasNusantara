package com.ummi.makanankhasnusantara

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KhasNusantara (
    var name : String,
    var description : String,
    var photo : String
) : Parcelable