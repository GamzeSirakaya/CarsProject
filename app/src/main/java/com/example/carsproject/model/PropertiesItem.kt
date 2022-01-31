package com.example.carsproject.model


import com.squareup.moshi.Json

data class PropertiesItem(

    @Json(name = "name")
    val name: String? = null,

    @Json(name = "value")
    val value: String? = null
)