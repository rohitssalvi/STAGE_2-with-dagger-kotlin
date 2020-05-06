package com.mindorks.bootcamp.learndagger

import android.app.Application
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.component.ApplicationComponent
import com.mindorks.bootcamp.learndagger.di.component.DaggerApplicationComponent
import com.mindorks.bootcamp.learndagger.di.module.ApplicationModule
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import javax.inject.Inject

class MyApplication : Application() {
    @Inject
   lateinit var networkService:NetworkService
    @Inject
   lateinit var databaseService: DatabaseService
    @Inject
   lateinit var networkHelper: NetworkHelper

   lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent=DaggerApplicationComponent.builder().applicationModule(
            ApplicationModule(this)).build();
        applicationComponent.Inject(this)

    }
}