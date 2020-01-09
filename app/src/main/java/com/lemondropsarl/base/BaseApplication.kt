package com.lemondropsarl.base

import android.app.Application
import com.lemondropsarl.base.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BaseApplication : Application(), HasAndroidInjector {

    override fun androidInjector(): AndroidInjector<Any> = androidInjector


    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>


    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)


    }
}