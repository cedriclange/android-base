package com.lemondropsarl.base.ui

import com.lemondropsarl.base.di.scopes.ActivityScope
import com.lemondropsarl.base.ui.main.MainActivity
import com.lemondropsarl.base.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    //add all activities and their modules here See beloz example
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @ActivityScope
    abstract fun contributeMainActivity() : MainActivity
}