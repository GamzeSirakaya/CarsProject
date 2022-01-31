package com.example.carsproject.model

import com.squareup.moshi.Json

data class CarsItem(

    @Json(name = "date")
    val date: String? = null,

    @Json(name = "modelName")
    val modelName: String? = null,

    @Json(name = "price")
    val price: Int? = null,

    @Json(name = "priceFormatted")
    val priceFormatted: String? = null,

    @Json(name = "photo")
    val photo: String? = null,

    @Json(name = "location")
    val location: Location? = null,

    @Json(name = "id")
    val id: Int? = null,

    @Json(name = "dateFormatted")
    val dateFormatted: String? = null,

    @Json(name = "title")
    val title: String? = null,

    @Json(name = "category")
    val category: Category? = null,

    @Json(name = "properties")
    val properties: List<PropertiesItem?>? = null
)