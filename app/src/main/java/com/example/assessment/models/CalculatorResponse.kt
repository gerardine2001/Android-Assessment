package com.example.assessment.models

import com.google.gson.annotations.SerializedName

data class CalculatorResponse(
    @SerializedName("number_two") var numberOne:Int,
    @SerializedName("number_one") var numberTwo:Int
)
