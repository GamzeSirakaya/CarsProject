package com.example.carsproject.model

import com.google.gson.annotations.SerializedName

data class CarsItem(

    @field:SerializedName("date")
    val date: String? = null,

    @field:SerializedName("modelName")
    val modelName: String? = null,

    @field:SerializedName("price")
    val price: Int? = null,

    @field:SerializedName("priceFormatted")
    val priceFormatted: String? = null,

    @field:SerializedName("photo")
    val photo: String? = null,

    @field:SerializedName("location")
    val location: Location? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("dateFormatted")
    val dateFormatted: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("category")
    val category: Category? = null,

    @field:SerializedName("properties")
    val properties: List<PropertiesItem?>? = null
)