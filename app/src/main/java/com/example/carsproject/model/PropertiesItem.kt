package com.example.carsproject.model

import com.google.gson.annotations.SerializedName

data class PropertiesItem(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("value")
    val value: String? = null
)