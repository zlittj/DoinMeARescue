package com.jzachlittle.doinmearescue.DaggerModules

import com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class DogFinderRetrofitModule {

    @Provides
    @Singleton
    fun provideHttpClient() : OkHttpClient {
        val httpClientBuilder = OkHttpClient().newBuilder()

        return httpClientBuilder.build()
    }

    @Provides
    @Singleton
    fun provideDogFinderRetrofit(httpClient: OkHttpClient): DogSearchApi {
        val restAdapter = Retrofit.Builder()
                .baseUrl("http://api.petfinder.com/")
                .client(httpClient)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        return restAdapter.create(DogSearchApi::class.java)
    }
}