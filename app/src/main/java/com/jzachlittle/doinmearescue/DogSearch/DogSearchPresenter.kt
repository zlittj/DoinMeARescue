package com.jzachlittle.doinmearescue.DogSearch

import android.util.Log
import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi
import com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogoSearchResponse
import kotlinx.coroutines.experimental.runBlocking
import retrofit2.Call
import ru.gildor.coroutines.retrofit.awaitResponse
import kotlin.reflect.jvm.internal.impl.javax.inject.Inject


class DogSearchPresenter @Inject constructor(private val dogSearchApi: DogSearchApi) :
        MvpPresenter<DogSearchView> {

    private val tag = "DogSearchPresenter"

    override fun attachView(view: DogSearchView?) {
        super.equals(view)
        val queryMap = mapOf("dog" to 1, "72034" to 2)
        startQuery(queryMap)
    }

    override fun detachView(retainInstance: Boolean) {
        super.equals(retainInstance)
    }

    private fun startQuery(queryMap: Map<String, Int>) = runBlocking {
        try {
            getResponse(queryMap)
        } catch (e: Exception) {
            Log.e(tag, e.message)
            e.printStackTrace()
        }
    }

    suspend fun getResponse(queryMap: Map<String, Int>): DogoSearchResponse? {
        return getDogData(queryMap).awaitResponse().body()
    }

    fun getDogData(queryMap: Map<String, Int>): Call<DogoSearchResponse> {
        return dogSearchApi.breedList(queryMap)
    }

}