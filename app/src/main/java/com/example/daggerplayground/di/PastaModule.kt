package com.example.daggerplayground.di

import com.example.daggerplayground.Pasta
import com.example.daggerplayground.Sauce
import com.example.daggerplayground.Shape
import dagger.Module
import dagger.Provides

@Module
class PastaModule {
    @Provides
    fun provideShape() = Shape()

    @Provides
    fun provideSauce() = Sauce()

//    @ActivityScope
    @Provides
    fun providePasta(shape: Shape, sauce: Sauce) = Pasta(shape, sauce)
}
