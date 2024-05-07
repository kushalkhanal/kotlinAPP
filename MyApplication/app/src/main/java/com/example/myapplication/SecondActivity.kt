package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var textName: TextView
    lateinit var editText: EditText
    lateinit var editText1: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)
        button=findViewById(R.id.button12)
        editText=findViewById(R.id.editText)
        editText1=findViewById(R.id.editText1)

        textName.text = intent.getStringExtra("name")
    }
}