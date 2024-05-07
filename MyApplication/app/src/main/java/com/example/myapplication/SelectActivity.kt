package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SelectActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_select)
        button = findViewById(R.id.button10)
        editText = findViewById(R.id.editTextText)

        button.setOnClickListener{
            var intent= Intent(this@SelectActivity,RecyclerActivity::class.java)
            intent.putExtra("name", editText.text)
            startActivity(intent)
        }

    }
}
