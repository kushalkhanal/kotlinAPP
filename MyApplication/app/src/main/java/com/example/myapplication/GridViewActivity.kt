package com.example.myapplication

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.Adapter.PhoneAdapter

class GridViewActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_grid_view)
        gridView = findViewById(R.id.gridView)
        fillArrays()

        var adapter = PhoneAdapter(nameList, imageList)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext, nameList[position], Toast.LENGTH_LONG).show()
        }


    }

    fun fillArrays() {
        nameList.add("phone1")
        nameList.add("phone2")
        nameList.add("phone3")
        nameList.add("phone4")
        nameList.add("phone5")
        nameList.add("phone6")
        nameList.add("phone7")
        nameList.add("phone8")

        imageList.add(R.drawable.phone1)
        imageList.add(R.drawable.phone2)
        imageList.add(R.drawable.phone3)
        imageList.add(R.drawable.phone4)
        imageList.add(R.drawable.phone5)
        imageList.add(R.drawable.phone6)
        imageList.add(R.drawable.phone7)
        imageList.add(R.drawable.phone8)
    }
}