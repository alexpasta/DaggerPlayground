package com.example.daggerplayground.di

import com.example.daggerplayground.AnotherActivity
import com.example.daggerplayground.MainActivity
import dagger.Subcomponent

//@ActivityScope
@Subcomponent(modules = [ActivityData2Module::class])
interface AppSubComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: AnotherActivity)
}