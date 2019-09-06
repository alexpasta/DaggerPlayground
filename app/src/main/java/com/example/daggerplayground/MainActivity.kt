package com.example.daggerplayground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.daggerplayground.di.DaggerMainComponent
//import com.example.daggerplayground.di.DaggerMainComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    private val TAG = javaClass.simpleName
    @Inject lateinit var pizza: Pizza
    @Inject lateinit var pasta: Pasta
    @Inject lateinit var pasta2: Pasta
    @Inject lateinit var restaurant: Restaurant

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as RestaurantApp).appComponent

        DaggerMainComponent.builder()
            .appComponent(appComponent)
            .build()
            .inject(this)

        Log.d(TAG, pizza.toString())
        Log.d(TAG, pasta.toString())
        Log.d(TAG, pasta2.toString())
        Log.d(TAG, restaurant.toString())
    }

    fun openAnotherActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}
