package com.example.carsproject.network

import com.example.carsproject.model.Cars
import io.reactivex.Observer
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CarAPI {

    @GET("listing")
    suspend fun getDataFromAPI(@Query("sort")sort:Int,
                       @Query("sortDirection")sortDirection:Int,
                       @Query("take") take: Int,
                       @Query("skip") skip: Int,
    ): Response<List<Cars>>

}