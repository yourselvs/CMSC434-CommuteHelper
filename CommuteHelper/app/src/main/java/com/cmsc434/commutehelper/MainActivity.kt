package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val historyBtn: ImageButton = findViewById(R.id.History)

        historyBtn.setOnClickListener {
            val intent = Intent(applicationContext, HistoryMain::class.java)
            startActivity(intent)
        }
    }
}
