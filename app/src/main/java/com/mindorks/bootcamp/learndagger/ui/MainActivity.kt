package com.mindorks.bootcamp.learndagger.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.component.DaggerMainActivityComponent
import com.mindorks.bootcamp.learndagger.di.module.MainActivityModule
import com.mindorks.bootcamp.learndagger.fragment.HomeFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG="MainActivity"
    @Inject
    lateinit var mainViewModel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GetDependency()
        setContentView(R.layout.activity_main)
        Log.e(TAG,mainViewModel.getSomeData())

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.Rl_Data, HomeFragment())
            .commit()

    }

    fun GetDependency(){
        DaggerMainActivityComponent
            .builder()
            .mainActivityModule(MainActivityModule(this))
            .applicationComponent((applicationContext as MyApplication).applicationComponent)
            .build()
            .inject(this)
        /*DaggerMainActrivityComponent
            .builder()
            .mainActivtyModule(MainActivtyModule(this))
            .applicationComponent((applicationContext as MyApplication).applicationComponent)
            .build()
            .inject(this)*/
    }
}