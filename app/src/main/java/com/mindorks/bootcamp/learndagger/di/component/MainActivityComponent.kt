package com.mindorks.bootcamp.learndagger.di.component

import com.mindorks.bootcamp.learndagger.di.ActivityScope
import com.mindorks.bootcamp.learndagger.di.module.MainActivityModule
import com.mindorks.bootcamp.learndagger.ui.MainActivity
import dagger.Component
@ActivityScope
@Component(dependencies = arrayOf(ApplicationComponent::class),modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)
}