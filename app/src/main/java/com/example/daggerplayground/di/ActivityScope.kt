package com.example.daggerplayground.di

import kotlin.annotation.Retention
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope {}
