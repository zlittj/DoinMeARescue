package com.jzachlittle.doinmearescue.DogSearch.DogSearchApi

import retrofit2.http.GET
import retrofit2.http.QueryMap


interface DogSearchInterface {

    @GET("/breed.list")
    fun breedList(@QueryMap map: Map<String, String>)
}