package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MakeTripDestination : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_trip_destination)

        var destination: EditText = findViewById(R.id.destination)
        var searchBtn: Button = findViewById(R.id.search_button)

        searchBtn.setOnClickListener {
            val intent = Intent(applicationContext, MakeTripStart::class.java)
            intent.putExtra("destination", destination.text.toString())
            startActivity(intent)
        }
    }
}
