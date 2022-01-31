package com.example.carsproject.model

import com.google.gson.annotations.SerializedName


data class Location(

    @field:SerializedName("townName")
    val townName: String? = null,

    @field:SerializedName("cityName")
    val cityName: String? = null
)