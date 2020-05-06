package com.mindorks.bootcamp.learndagger.di.module

import android.app.Activity
import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.ui.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(var activity: Activity) {
    @ApplicationContext
    @Provides
    fun ProvideContext():Context?=activity
}