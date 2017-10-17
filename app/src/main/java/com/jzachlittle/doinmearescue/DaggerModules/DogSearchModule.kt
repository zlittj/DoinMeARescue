package com.jzachlittle.doinmearescue.DaggerModules

import com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi
import com.jzachlittle.doinmearescue.DogSearch.DogSearchPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DogSearchModule {

    @Provides
    @Singleton
    fun provideDogSearchPresenter(dogSearchApi: DogSearchApi) : DogSearchPresenter {
        return DogSearchPresenter(dogSearchApi)
    }

}