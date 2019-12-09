package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MakeTripStart : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_trip_start)

        var destinationText: TextView = findViewById(R.id.destination)
        val destination = intent.getStringExtra("destination")
        destinationText.text = "To $destination"
        var startBtn: Button = findViewById(R.id.start)

        startBtn.setOnClickListener {
            val intent = Intent(applicationContext, MakeTripInProgress::class.java)
            intent.putExtra("destination", destination)
            startActivity(intent)
        }
    }
}
