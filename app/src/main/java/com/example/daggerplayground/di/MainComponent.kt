package com.example.daggerplayground.di

import com.example.daggerplayground.MainActivity
import com.example.daggerplayground.Pasta
import com.example.daggerplayground.Pizza
import dagger.Component


@Activity2Scope
@ActivityScope
@Component(modules = [PastaModule::class])
interface MainComponent {
    fun pasta(): Pasta
    fun pizza(): Pizza
    fun inject(activity: MainActivity)
}
