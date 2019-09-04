package com.example.daggerplayground.di

import com.example.daggerplayground.ActivityData2
import dagger.Module
import dagger.Provides

@Module
class ActivityData2Module {
//    @ActivityScope
    @Provides
    fun provideActivityData2() = ActivityData2()

}