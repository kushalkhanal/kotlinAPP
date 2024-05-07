package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SpinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var textView: TextView
    lateinit var spinner: Spinner
    var data = arrayOf("nepal", "China", "india")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)

        textView = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)
        spinner.onItemSelectedListener = this

        var adapter = ArrayAdapter(this@SpinnerActivity, android.R.layout.simple_list_item_1, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, index: Int, id: Long) {

        if (parent != null) {
            textView.text = parent.getItemAtPosition(index).toString()
        }

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")

    }
}