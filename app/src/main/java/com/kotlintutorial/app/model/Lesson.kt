package com.kotlintutorial.app.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Lesson(
    val title: String,
    val lesson: String?=null
):Parcelable
