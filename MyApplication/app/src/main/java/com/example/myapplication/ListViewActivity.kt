package com.example.myapplication

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class ListViewActivity : AppCompatActivity() {

    lateinit var list_country: ListView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        list_country = findViewById(R.id.listviewid)
        val data = resources.getStringArray(R.array.Countries)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        val builder = AlertDialog.Builder(this)

        list_country.adapter = adapter



        list_country.setOnItemClickListener { parent, view, position, id ->
            val selectCountry: String = parent.getItemAtPosition(position).toString()
            builder.setTitle("alert dialogue").setMessage("selected county" + selectCountry)
            val alertDialog:AlertDialog=builder.create()
            alertDialog.show()
        }

    }
}