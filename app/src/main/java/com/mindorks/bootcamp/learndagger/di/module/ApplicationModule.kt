package com.mindorks.bootcamp.learndagger.di.module

import android.content.Context
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo
import dagger.Module
import dagger.Provides
@Module
class ApplicationModule(var myApplication: MyApplication) {

    @ApplicationContext
    @Provides
    fun ProvideContext():Context=myApplication
    @DatabaseInfo
    @Provides
    fun ProvideDatabaseName()="dummy_db"
    @Provides
    fun databaseVesrion()=1
    @NetworkInfo
    @Provides
    fun provideNetworkApiKey()="abcedfg"



}