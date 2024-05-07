package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Snackbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import  com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.SnackbarLayout

class ButtonsActivity : AppCompatActivity() {
    lateinit var checkboxtoast: CheckBox
    lateinit var checkboxsnack: CheckBox
    lateinit var checkboxalert: CheckBox
    lateinit var main: ConstraintLayout
    lateinit var buttonclick: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buttons)
        checkboxtoast = findViewById(R.id.toastmessage)
        checkboxsnack = findViewById(R.id.snackbar)
        checkboxalert = findViewById(R.id.alertdialogue)
        buttonclick = findViewById(R.id.button1)
        main = findViewById(R.id.main)

        buttonclick.setOnClickListener {
            if (checkboxtoast.isChecked) {
                Toast.makeText(this@ButtonsActivity, "this is toast", Toast.LENGTH_SHORT).show()

            } else if (checkboxsnack.isChecked) {
               Snackbar.make(checkboxsnack,"dsds",Snackbar.LENGTH_LONG).show()
            } else {
//        alert dialogue
                val alertDialog=AlertDialog.Builder(this@ButtonsActivity)
                alertDialog.setTitle("alet dialogue").setMessage("this is ")
                alertDialog.create().show()
            }
        }


    }

}