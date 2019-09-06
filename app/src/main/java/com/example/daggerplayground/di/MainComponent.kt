package com.example.daggerplayground.di

import com.example.daggerplayground.MainActivity
import dagger.Component


@Activity2Scope
@ActivityScope
@Component(modules = [FoodModule::class], dependencies = [AppComponent::class])
interface MainComponent {
    fun inject(activity: MainActivity)
}
