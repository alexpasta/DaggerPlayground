package com.example.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerplayground.di.DaggerAppComponent
import com.example.daggerplayground.di.DaggerMainComponent
//import com.example.daggerplayground.di.DaggerMainComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject lateinit var pasta: Pasta
    @Inject lateinit var pasta2: Pasta

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        DaggerMainComponent.create().inject(this)
//
//        Log.d(TAG, pasta.toString())
//        Log.d(TAG, pasta2.toString())

        val mainComponent = DaggerMainComponent.create()

        Log.d(TAG, mainComponent.pasta().toString())
        Log.d(TAG, mainComponent.pasta().toString())
    }
}



//class MainActivity : AppCompatActivity() {
//    @Inject lateinit var pasta: Pasta
//    @Inject lateinit var pasta2: Pasta
//
//    @Inject lateinit var pizza: Pizza
//    @Inject lateinit var pizza2: Pizza
//
//    lateinit var appData: AppData
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        DaggerMainComponent.create().inject(this)
//        val appComponent = DaggerAppComponent.create()
//
//        Log.d(TAG, pasta.toString())
//        Log.d(TAG, pasta2.toString())
//
//        Log.d(TAG, pizza.toString())
//        Log.d(TAG, pizza2.toString())
//
//        Log.d(TAG, appComponent.appData().toString())
//    }
//}


//class MenuActivity : AppCompatActivity() {
//    //    @Inject
////    lateinit var appData: AppData
//    @Inject
//    lateinit var pasta: Pasta
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        DaggerMenuComponent.create().inject(this)
//        Log.d("TESTTT", pasta.toString())
//    }
//
//    fun openAnotherActivity(view: View) {
//        startActivity(Intent(this, AnotherActivity::class.java))
//
//        //        (application as MyApp).appComponent.appSubComponent().inject(this)
//
////        DaggerMenuComponent
////            .builder()
//////            .appComponent((application as MyApp).appComponent)
////            .build()
////            .inject(this)
//
////        Log.d("TESTTT", appData.toString())
//    }
//}
