package com.jzachlittle.doinmearescue.DogSearch.DogSearchApi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap


interface DogSearchApi {

    @GET("/breed.list")
    fun breedList(@QueryMap map: Map<String, Int>): Call<DogoSearchResponse>
}