package com.example.daggerplayground

import android.util.Log
import com.example.daggerplayground.di.Activity2Scope
import com.example.daggerplayground.di.ActivityScope
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScope
class Pizza @Inject constructor() {
    @Inject
    fun testMethodInjection(pasta: Pasta) {
        Log.d(TAG, "Member injection! pasta:" + pasta.toString())
    }

    @Inject
    fun testMethodInjection2() {
        Log.d(TAG, "Member injection!")
    }
}