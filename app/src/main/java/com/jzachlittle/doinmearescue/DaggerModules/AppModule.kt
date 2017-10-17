package com.jzachlittle.doinmearescue.DaggerModules

import com.jzachlittle.doinmearescue.RescueApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: RescueApplication) {

    @Provides @Singleton
    fun provideContext() = application
}