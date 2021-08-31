package com.example.assessment.api

import com.example.assessment.models.CalculatorRequest
import com.example.assessment.models.CalculatorResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("//calculator/add")
    fun addition(@Body calculatorRequest: CalculatorRequest):Response<CalculatorResponse>


    @POST("/calculator/subtract")
    fun subtraction(@Body calculatorRequest: CalculatorRequest):Response<CalculatorResponse>


    @POST("/calculator/divide")
    fun multiplication(@Body calculatorRequest: CalculatorRequest):Response<CalculatorResponse>


    @POST("/calculator/multiply")
    fun divide(@Body calculatorRequest: CalculatorRequest):Response<CalculatorResponse>




}