package com.cbellmont.ejemploparcelable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExampleClass(val content: String) : Parcelable