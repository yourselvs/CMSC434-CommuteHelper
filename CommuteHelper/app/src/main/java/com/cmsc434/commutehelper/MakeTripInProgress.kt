package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MakeTripInProgress : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_trip_in_progress)

        var destinationText: TextView = findViewById(R.id.destination)
        val destination = intent.getStringExtra("destination")
        destinationText.text = "To $destination"

        Handler().postDelayed({
            val intent = Intent(applicationContext, MakeTripComplete::class.java)
            intent.putExtra("destination", destination)
            startActivity(intent)
        }, 3000)
    }
}
