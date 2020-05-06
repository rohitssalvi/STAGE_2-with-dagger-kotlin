package com.mindorks.bootcamp.learndagger.data.local

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import javax.inject.Inject

class DatabaseService @Inject constructor(@ApplicationContext val context: Context, @DatabaseInfo val databaseName:String, val databaseVersion:Int)
{
    fun GetDummyData()="DATA BASE DUMMY DATA"
}