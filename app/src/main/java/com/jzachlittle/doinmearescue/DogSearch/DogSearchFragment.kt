package com.jzachlittle.doinmearescue.DogSearch

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.mosby3.mvp.MvpFragment
import com.jzachlittle.doinmearescue.Extensions.inflate
import com.jzachlittle.doinmearescue.R
import com.jzachlittle.doinmearescue.RescueApplication
import kotlinx.android.synthetic.main.fragment_dog_search.*


class DogSearchFragment: MvpFragment<DogSearchView, DogSearchPresenter>(), DogSearchView {

    private val recyclerView by lazy { dog_recycler_view }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_dog_search)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun createPresenter(): DogSearchPresenter {
        return RescueApplication.appComponent.dogSearchPresenter()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(context)
    }

}
