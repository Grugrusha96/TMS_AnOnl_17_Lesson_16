package com.example.lesson16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    companion object {
        const

        val SLEEP = 3000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
            SLEEP
        }
    }
}


