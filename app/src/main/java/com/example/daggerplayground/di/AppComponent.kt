package com.example.daggerplayground.di

import com.example.daggerplayground.Restaurant
import com.example.daggerplayground.RestaurantApp
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: RestaurantApp)
    fun restaurant(): Restaurant
    fun secondComponent(): SecondComponent
}
