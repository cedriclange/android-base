package com.lemondropsarl.base.ui.base

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseActivity: AppCompatActivity(), HasSupportFragmentInjector {

    //this is for injection (Injecting your fragment)
    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    //@Inject
    //lateinit var viewModelFactory: ViewModelProvider.Factory

    //get the layout from activity


    /*protected fun <T : ViewModel> getViewModel(cls: Class<T>): T {
        return ViewModelProviders.of(this, viewModelFactory).get(cls)
    }*/


    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentInjector
}