package com.example.fundamentosandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        println("onStart chamado!")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart chamado!")
    }

    override fun onResume() {
        super.onResume()
        println("onResume chamado!")
    }

    override fun onPause() {
        super.onPause()
        println("onPause chamado!")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy chamado!")
    }

}
