package com.jzachlittle.doinmearescue.DaggerModules

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class DogFinderRetrofit {

    @Provides
    @Singleton
    fun provideHttpClient() : OkHttpClient {
        val httpClientBuilder = OkHttpClient().newBuilder()

        return httpClientBuilder.build()
    }

    @Provides
    @Singleton
    fun provideDogFinderRetrofit(httpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .baseUrl("http://api.petfinder.com/")
                .client(httpClient)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
    }
}