package com.lemondropsarl.base.di.component

import com.lemondropsarl.base.BaseApplication
import com.lemondropsarl.base.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, AndroidInjectionModule::class])
interface AppComponent: AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application : BaseApplication): Builder


        fun build() : AppComponent
    }
}