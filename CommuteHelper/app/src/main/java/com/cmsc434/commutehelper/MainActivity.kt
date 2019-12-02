package com.cmsc434.commutehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    fun jumpToNext() {
        val intent = Intent(applicationContext, SecondActivity::class.java)
        startActivity(intent)
    }
}
