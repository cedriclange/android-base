package com.lemondropsarl.base.ui.main

import androidx.appcompat.app.AppCompatActivity
import com.lemondropsarl.base.di.scopes.ActivityScope
import com.lemondropsarl.base.ui.FragmentsModule
import dagger.Binds
import dagger.Module

/*
* This is your MainActivityModule everything that the mainActivity will need
* Inject it here in @Module
* See Below Fragments are Injected in the Main Activity*/
@Module(includes = [FragmentsModule::class])
abstract class MainActivityModule {
    @Binds
    @ActivityScope
    abstract fun bindMainActivity(activity: MainActivity): AppCompatActivity

}