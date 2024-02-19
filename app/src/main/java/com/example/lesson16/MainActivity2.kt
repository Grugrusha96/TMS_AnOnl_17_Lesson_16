package com.example.lesson16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    companion object {
        const

        val SleepSessionRecord = 3000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.button2)
        val button2 = findViewById<Button>(R.id.button7)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            SleepSessionRecord
        }
        button2.setOnClickListener {
            val intent1 = Intent(this, MainActivity4::class.java)
            startActivity(intent1)
            SleepSessionRecord


        }
    }
}
