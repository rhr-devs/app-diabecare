package com.example.android.diabecare.models

import com.google.gson.annotations.SerializedName

data class PredictionResult(
    @SerializedName("risk status")
    val risk : String)
