package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HistoryMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_main)

        var recordBtn: TextView = findViewById(R.id.record_today_clickable)

        recordBtn.setOnClickListener {
            val intent = Intent(applicationContext, history_listview::class.java)
            startActivity(intent)
        }
    }
}
