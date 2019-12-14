package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MakeTripComplete : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_trip_complete)

        var destinationText: TextView = findViewById(R.id.destination)
        val destination = intent.getStringExtra("destination")
        destinationText.text = "To $destination"
        var finishBtn: Button = findViewById(R.id.finish)

        finishBtn.setOnClickListener {
            val intent = Intent(applicationContext, HistoryMain::class.java)
            startActivity(intent)
        }
    }
}
