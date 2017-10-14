package com.jzachlittle.doinmearescue.Login

import android.os.Bundle
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import com.jzachlittle.doinmearescue.R

class LoginActivity : MvpActivity<LoginView, LoginPresenter>(), LoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun createPresenter(): LoginPresenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun success() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun error() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
