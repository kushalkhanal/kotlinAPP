package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class AutoCompleteActivity : AppCompatActivity() {
    lateinit var autoCompleteActivity: AutoCompleteTextView
    lateinit var button: Button
    lateinit var main: ConstraintLayout

    var country= arrayOf("nepal", "china","messi")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoCompleteActivity=findViewById(R.id.autoCompleteTextView)
        button=findViewById(R.id.button)

       val autoCompleteAdapter= ArrayAdapter(this@AutoCompleteActivity,android.R.layout.simple_dropdown_item_1line,country)
        autoCompleteActivity.setAdapter(autoCompleteAdapter)
        autoCompleteActivity.threshold=1

        button.setOnClickListener(){
//            Toast.makeText(this, autoCompleteActivity.text.toString(), Toast.LENGTH_SHORT).show()
            Snackbar.make(main,autoCompleteActivity.text.toString(), Snackbar.LENGTH_LONG).show()

        }










    }
}