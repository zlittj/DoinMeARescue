package com.jzachlittle.doinmearescue

import android.app.Application
import com.jzachlittle.doinmearescue.DaggerModules.AppComponent
import com.jzachlittle.doinmearescue.DaggerModules.AppModule
import com.jzachlittle.doinmearescue.DaggerModules.DaggerAppComponent


class RescueApplication : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))

                .build()
    }
}