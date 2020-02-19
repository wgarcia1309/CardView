package com.uninorte.cardview.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(var tittle: String,
                var First: String,
                var last: String,
                var email: String,
                var phone: String,
                val imageURl: String) : Parcelable {


}