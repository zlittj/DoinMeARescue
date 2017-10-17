package com.jzachlittle.doinmearescue.DaggerModules

import com.jzachlittle.doinmearescue.DogSearch.DogSearchFragment
import com.jzachlittle.doinmearescue.DogSearch.DogSearchPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, DogFinderRetrofitModule::class, DogSearchModule::class))
interface AppComponent {

    fun inject(dogSearchFragment: DogSearchFragment)

    fun inject(dogSearchPresenter: DogSearchPresenter)

    @Singleton fun dogSearchPresenter() : DogSearchPresenter
}