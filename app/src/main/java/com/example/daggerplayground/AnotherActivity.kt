package com.example.daggerplayground

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerplayground.di.DaggerMainComponent
//import com.example.daggerplayground.di.DaggerMainComponent
import javax.inject.Inject

class AnotherActivity : AppCompatActivity() {
    private val TAG = javaClass.simpleName
    @Inject lateinit var pasta: Pasta
    @Inject lateinit var pasta2: Pasta

    @Inject lateinit var restaurant: Restaurant

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appComponent = (application as RestaurantApp).appComponent

        DaggerMainComponent.builder()
            .appComponent(appComponent)
            .build()
            .inject(this)

        Log.d(TAG, pasta.toString())
        Log.d(TAG, pasta2.toString())
        Log.d(TAG, restaurant.toString())

        Log.d(TAG, pasta.toString())
        Log.d(TAG, pasta2.toString())
    }
}
