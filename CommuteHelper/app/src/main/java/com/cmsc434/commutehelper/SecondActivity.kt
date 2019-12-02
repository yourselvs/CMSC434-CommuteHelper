package com.cmsc434.commutehelper

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("Registered")
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val intent = intent
    }

    fun jumpToPrevious(view: View) {
        //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //startActivity(intent);
        finish()
    }
}