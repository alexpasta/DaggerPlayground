package com.example.daggerplayground.di

import com.example.daggerplayground.SecondActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [DrinkModule::class])
interface SecondComponent {
    fun inject(activity: SecondActivity)
}