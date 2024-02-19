package com.example.lesson16

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity5 : AppCompatActivity() {
    companion object {
        const

        val SleepSessionRecord = 3000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            SleepSessionRecord
        }

        val builder = AlertDialog.Builder(this)
        val intent = Intent(this, MainActivity3::class.java)

        builder.setTitle("Вызвано с 3 окна")
        builder.setNeutralButton("") { dialog, which ->
            startActivity(intent)

        }
        builder.show()
    }
}

