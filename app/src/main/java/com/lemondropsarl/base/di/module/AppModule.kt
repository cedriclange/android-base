package com.lemondropsarl.base.di.module

import android.app.Application
import android.content.Context
import com.lemondropsarl.base.BaseApplication
import com.lemondropsarl.base.di.qualifier.ApplicationContext
import com.lemondropsarl.base.ui.ActivitiesModule
import com.lemondropsarl.base.ui.viewmodel.ViewModelModule
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/*
* In this class Includes all your modules that your application will use*/
@Module(
    includes = [ActivitiesModule::class, ViewModelModule::class]
)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun bindApplication(application : BaseApplication) : Application
    @Binds
    @Singleton
    @ApplicationContext
    abstract fun bindApplicationContext(application: Application): Context
}