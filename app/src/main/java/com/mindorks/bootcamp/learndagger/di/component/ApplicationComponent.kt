package com.mindorks.bootcamp.learndagger.di.component

import android.content.Context
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.module.ApplicationModule
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component( modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun Inject(myApplication: MyApplication)
    @ApplicationContext
    fun getContext():Context

    fun getDatabaseService():DatabaseService

    fun getNetworkService():NetworkService

    fun getNetworkHelper():NetworkHelper

}