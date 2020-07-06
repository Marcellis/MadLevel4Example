package com.example.madlevel3example

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Reminder(
    var reminderText: String
) : Parcelable