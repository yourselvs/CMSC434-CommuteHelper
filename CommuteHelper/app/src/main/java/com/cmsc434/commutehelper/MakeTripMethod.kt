package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MakeTripMethod : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_trip_method)

        val walkBtn: ImageButton = findViewById(R.id.walk)
        val bikeBtn: ImageButton = findViewById(R.id.bike)

        walkBtn.setOnClickListener {
            startActivity(Intent(applicationContext, MakeTripDestination::class.java))
        }
        bikeBtn.setOnClickListener {
            startActivity(Intent(applicationContext, MakeTripDestination::class.java))
        }
    }
}
