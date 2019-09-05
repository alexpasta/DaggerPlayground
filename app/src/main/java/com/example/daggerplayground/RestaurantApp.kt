package com.example.daggerplayground

import android.app.Application
import android.util.Log
import com.example.daggerplayground.di.AppComponent
import com.example.daggerplayground.di.DaggerAppComponent
import javax.inject.Inject

class RestaurantApp : Application() {
    private val TAG = javaClass.simpleName
    @Inject
    lateinit var restaurant: Restaurant

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
        appComponent.inject(this)

        Log.d(TAG, restaurant.toString())
    }
}
