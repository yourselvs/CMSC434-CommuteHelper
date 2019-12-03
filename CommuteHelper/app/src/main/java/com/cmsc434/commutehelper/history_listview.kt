package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class history_listview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_listview)

        val graphBtn: Button = findViewById(R.id.button2)

        graphBtn.setOnClickListener {
            val intent = Intent(applicationContext, HistoryGridView::class.java)
            startActivity(intent)
        }
    }
}
