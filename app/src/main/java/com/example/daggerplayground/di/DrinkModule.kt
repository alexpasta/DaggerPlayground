package com.example.daggerplayground.di

import com.example.daggerplayground.Coke
import dagger.Module
import dagger.Provides

@Module
class DrinkModule {
    @ActivityScope
    @Provides
    fun provideCoke() = Coke()

}