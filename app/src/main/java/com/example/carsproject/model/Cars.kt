package com.example.carsproject.model

import com.squareup.moshi.Json

data class Cars(
    @Json(name = "Response")
    val response: List<CarsItem?>? = null
)







