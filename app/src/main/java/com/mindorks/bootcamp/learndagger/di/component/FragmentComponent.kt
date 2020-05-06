package com.mindorks.bootcamp.learndagger.di.component

import com.mindorks.bootcamp.learndagger.di.FragmentScope
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule
import com.mindorks.bootcamp.learndagger.fragment.HomeFragment
import dagger.Component

@FragmentScope
@Component(dependencies = arrayOf(ApplicationComponent::class),modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun Inject(homeFragment: HomeFragment)
}