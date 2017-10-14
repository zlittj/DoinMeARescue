package com.jzachlittle.doinmearescue

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import com.jzachlittle.doinmearescue.DogSearch.DogSearchFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) changeFragment(DogSearchFragment())
    }

    fun changeFragment(newFragment: Fragment, cleanStack: Boolean = false) {
        val oldFragment = supportFragmentManager.beginTransaction()
        if (cleanStack) clearBackStack()
        oldFragment.replace(R.id.fragment_frame, newFragment)
        oldFragment.addToBackStack(null)
        oldFragment.commit()
    }

    fun clearBackStack() {
        val manager = supportFragmentManager
        if (manager.backStackEntryCount > 0) {
            val first = manager.getBackStackEntryAt(0)
            manager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }
}
