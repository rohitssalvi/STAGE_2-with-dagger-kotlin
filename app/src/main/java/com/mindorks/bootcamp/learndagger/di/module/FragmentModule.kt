package com.mindorks.bootcamp.learndagger.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(var fragment: Fragment)
{
    @ActivityContext
    @Provides
    fun ProvideConrext():Context?= fragment.context

}