package com.lemondropsarl.base.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lemondropsarl.base.di.factory.BaseViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {


    /*
    * This where you can declare all your ViewModel For your Fragment
    * See Example Below declaring Fragment HomeViewModel
    * */

    //@Binds
    //@IntoMap
    //@ViewModelKey(HomeViewModel::class)
    //abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    //this is the binding ViewModel Factory it Binds all ViewModels Accordingly
    @Binds
    abstract fun bindViewModelFactory(factory: BaseViewModelFactory): ViewModelProvider.Factory
}