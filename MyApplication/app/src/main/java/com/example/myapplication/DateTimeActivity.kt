package com.example.myapplication

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.DatePickerDialog
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class DateTimeActivity : AppCompatActivity() {
    lateinit var btnLoadCalender: Button
    lateinit var txtloadCalender: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_date_time)
        btnLoadCalender = findViewById(R.id.loadCalender)
        txtloadCalender = findViewById(R.id.textView2)

        btnLoadCalender.setOnClickListener{loadCalender()}

    }

    private fun loadCalender() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this, { view, year, monthOfYear, dayOfMonth ->
                txtloadCalender.text = "select date:$dayOfMonth/${monthOfYear + 1}/$year"
            },
            year,
            month, day
        )
        datePickerDialog.show()
    }

}