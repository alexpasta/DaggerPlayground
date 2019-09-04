package com.example.daggerplayground.di

import android.app.Activity
import com.example.daggerplayground.AppData
import com.example.daggerplayground.RestaurantApp
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: RestaurantApp)
    fun appData(): AppData

//    fun appSubComponent(): AppSubComponent
}
