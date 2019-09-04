package com.example.daggerplayground

import android.app.Application
import android.util.Log
import com.example.daggerplayground.di.AppComponent
import com.example.daggerplayground.di.DaggerAppComponent
import javax.inject.Inject

val TAG = "DaggerTest"

class RestaurantApp : Application() {
    @Inject
    lateinit var appData: AppData

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
        appComponent.inject(this)

        Log.d(TAG, appData.toString())
    }
}