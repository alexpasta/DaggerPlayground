package com.example.daggerplayground.di

import com.example.daggerplayground.Pasta
import com.example.daggerplayground.Sauce
import com.example.daggerplayground.Shape
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PastaModule {
    @Provides
    @ActivityScope
    fun provideShape() = Shape()

    @Provides
    @ActivityScope
    fun provideSauce() = Sauce()

    @Provides
    @ActivityScope
    fun providePasta(shape: Shape, sauce: Sauce) = Pasta(shape, sauce)
}
