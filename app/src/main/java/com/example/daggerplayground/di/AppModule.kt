package com.example.daggerplayground.di

import com.example.daggerplayground.AppData
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideAppData() = AppData()
}