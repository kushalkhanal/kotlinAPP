package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NayaActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var button2: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_naya)
        textView = findViewById(R.id.lblTextView)
        button = findViewById(R.id.Btn1)
        button2 = findViewById(R.id.Btn2)

        button.setOnClickListener {
            counter += 1
            textView.text = " " + counter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("message", "on start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("message", "on resume called")

    }

    override fun onPause() {
        super.onPause()
        Log.d("message", "on paused called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("message", "on destory called")

    }
}