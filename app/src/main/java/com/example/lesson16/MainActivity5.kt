package com.example.lesson16

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment


class MainActivity5 : AppCompatActivity() {
    companion object {
        const val SLEEP = 3000L
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            it.postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }, SLEEP)
        }


        val builder = AlertDialog.Builder(this)
        findViewById<Button>(R.id.button8)
        builder.setTitle("Вызвано с 3 окна")
        builder.setNeutralButton("") { dialog, which ->

        }
        builder.show()
    }
}





