package com.example.lesson16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    companion object {
        const

        val SLEEP = 3000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.button2)
        val button2 = findViewById<Button>(R.id.button7)
        button.setOnClickListener {
            it.postDelayed({
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)

            }, SLEEP)
        }

        button2.setOnClickListener {

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)

        }
    }
}
