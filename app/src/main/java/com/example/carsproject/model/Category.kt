package com.example.carsproject.model

import com.squareup.moshi.Json

data class Category(

    @Json(name = "name")
    val name: String? = null,

    @Json(name = "id")
    val id: Int? = null
)