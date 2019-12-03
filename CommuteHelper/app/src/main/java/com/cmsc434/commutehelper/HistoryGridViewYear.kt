package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HistoryGridViewYear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_grid_view_year)

        val listBtn: Button = findViewById(R.id.button8)

        listBtn.setOnClickListener {
            val intent = Intent(applicationContext, history_listview::class.java)
            startActivity(intent)
        }

        val yearlyBtn: Button = findViewById(R.id.button10)

        yearlyBtn.setOnClickListener {
            val intent = Intent(applicationContext, HistoryGridView::class.java)
            startActivity(intent)
        }
    }
}
