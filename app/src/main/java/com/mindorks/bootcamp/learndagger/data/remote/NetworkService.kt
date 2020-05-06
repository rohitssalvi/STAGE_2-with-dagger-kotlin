package com.mindorks.bootcamp.learndagger.data.remote

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo
import javax.inject.Inject

class NetworkService@Inject constructor(@ApplicationContext val context: Context, @NetworkInfo val apiKey:String) {

    fun GetDummyData()="NETWORk SERVICE DUMMY DATA";
}