package com.example.carsproject.model

import com.squareup.moshi.Json


data class Location(

    @Json(name = "townName")
    val townName: String? = null,

    @Json(name = "cityName")
    val cityName: String? = null
)