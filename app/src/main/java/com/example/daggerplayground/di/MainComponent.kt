package com.example.daggerplayground.di

import com.example.daggerplayground.AnotherActivity
import com.example.daggerplayground.MainActivity
import com.example.daggerplayground.Pasta
import com.example.daggerplayground.Pizza
import dagger.Component
import javax.inject.Singleton


@Activity2Scope
@ActivityScope
@Component(modules = [PastaModule::class], dependencies = [AppComponent::class])
interface MainComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: AnotherActivity)
}
