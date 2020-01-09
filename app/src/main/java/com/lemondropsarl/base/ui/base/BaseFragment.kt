package com.lemondropsarl.base.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import javax.inject.Inject

/*
* Every Fragment must Inherit from this BaseFragment
* */

abstract class BaseFragment<T: ViewModel>: Fragment() {


    //get the resource of your layout in your Fragment
    @get:LayoutRes
    abstract val getLayoutViewRes: Int

    //Prepare your NavController once off
    val navController: NavController by lazy { findNavController() }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    abstract val viewModelClass: Class<T>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return if (getLayoutViewRes > 0) inflater.inflate(getLayoutViewRes, container, false)
        else null
    }


    /*
    *This is to instantiate your ViewModel in each of your Fragment
    * */
    fun getViewModel(): T {
        return ViewModelProviders.of(this, viewModelFactory).get(viewModelClass)

    }
}