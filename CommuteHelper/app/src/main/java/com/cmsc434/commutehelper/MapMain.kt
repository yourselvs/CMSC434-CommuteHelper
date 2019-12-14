package com.cmsc434.commutehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MapMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_plain)

        val notificationText: TextView = findViewById(R.id.notificationText)
        val notificationIcon: ImageView = findViewById(R.id.notificationIcon)

        notificationText.setOnClickListener {
            val intent = Intent(applicationContext, MapShorterPath::class.java)
            startActivity(intent)
        }
        notificationIcon.setOnClickListener {
            val intent = Intent(applicationContext, MapShorterPath::class.java)
            startActivity(intent)
        }
    }
}
