package com.example.carsproject.model

import com.google.gson.annotations.SerializedName

data class Cars(

	@field:SerializedName("Response")
	val response: List<CarsItem?>? = null
)







