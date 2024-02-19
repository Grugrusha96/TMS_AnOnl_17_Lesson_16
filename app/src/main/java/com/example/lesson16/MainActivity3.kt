package com.example.lesson16

import android.content.Intent
import android.health.connect.datatypes.SleepSessionRecord
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity3 : AppCompatActivity() {
    companion object {
        const

        val SleepSessionRecord = 3000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button = findViewById<Button>(R.id.button3)
        val button3 = findViewById<Button>(R.id.button8)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent2 = Intent(this, MainActivity5::class.java)
            startActivity(intent2)
            SleepSessionRecord
        }
    }
}