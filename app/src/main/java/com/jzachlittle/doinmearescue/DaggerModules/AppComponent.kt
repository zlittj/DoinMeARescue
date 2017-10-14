package com.jzachlittle.doinmearescue.DaggerModules

import android.app.ExpandableListActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, DogFinderRetrofit::class))
interface AppComponent {

    fun inject(issueListActivity: ExpandableListActivity)

}