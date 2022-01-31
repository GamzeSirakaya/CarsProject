package com.example.carsproject.repo

import com.example.carsproject.model.Cars
import com.example.carsproject.model.CarsItem
import com.example.carsproject.network.CarAPI
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class CarsRepository {
    private  val BASE_URL = "http://sandbox.arabamd.com/api/v1/"
    suspend fun getCars(): List<Cars> {

        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()

        val carService = retrofit.create(CarAPI::class.java)
        val response = carService.getDataFromAPIAsync(1, 0, 100,1)

        return response.await()
    }
}