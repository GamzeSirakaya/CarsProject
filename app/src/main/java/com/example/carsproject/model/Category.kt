package com.example.carsproject.model

import com.google.gson.annotations.SerializedName

data class Category(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
)