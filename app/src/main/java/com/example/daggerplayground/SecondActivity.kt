package com.example.daggerplayground

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerplayground.di.DaggerMainComponent
//import com.example.daggerplayground.di.DaggerMainComponent
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    private val TAG = javaClass.simpleName
    @Inject lateinit var coke: Coke
    @Inject lateinit var restaurant: Restaurant

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appComponent = (application as RestaurantApp).appComponent

        appComponent.secondComponent().inject(this)

        Log.d(TAG, coke.toString())
        Log.d(TAG, restaurant.toString())
    }
}
