package com.jzachlittle.doinmearescue.Login

import com.hannesdorfmann.mosby3.mvp.MvpView


interface LoginView : MvpView {

    fun showLoading()

    fun success()

    fun error()

}