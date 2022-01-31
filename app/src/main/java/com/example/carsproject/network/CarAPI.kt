package com.example.carsproject.network

import com.example.carsproject.model.Cars
import com.example.carsproject.model.CarsItem
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface CarAPI {

    @GET("listing")
     fun getDataFromAPIAsync(@Query("sort")sort:Int,
                             @Query("sortDirection")sortDirection:Int,
                             @Query("take") take: Int,
                             @Query("skip") skip: Int,
    ): Deferred<List<Cars>>

}