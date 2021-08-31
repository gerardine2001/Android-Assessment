package com.example.assessment.models

import com.google.gson.annotations.SerializedName

data class CalculatorRequest(
    @SerializedName("number_one") var numberOne:Int,
    @SerializedName("number_two") var numberTwo:Int


    )
