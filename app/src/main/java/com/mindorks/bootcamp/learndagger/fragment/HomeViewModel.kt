package com.mindorks.bootcamp.learndagger.fragment

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import javax.inject.Inject

class HomeViewModel @Inject constructor(val databaseService: DatabaseService,val networkService: NetworkService,val networkHelper: NetworkHelper)
{
    fun getDummyData()="${databaseService.GetDummyData()} ${networkService.GetDummyData()} ${networkHelper.IsNetworkConnected()}"
}