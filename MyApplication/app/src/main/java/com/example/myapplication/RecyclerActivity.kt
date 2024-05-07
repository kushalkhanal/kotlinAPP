package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapter.RecyclerAdapter

class RecyclerActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    var titleList=ArrayList<String>()
    var imageList=ArrayList<Int>()
    var descriptionList=ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_recycler)
        recyclerView=findViewById(R.id.recyclerView)

        titleList.add("phone1")
        titleList.add("phone2")
        titleList.add("phone3")

        imageList.add(R.drawable.phone1)
        imageList.add(R.drawable.phone2)
        imageList.add(R.drawable.phone3)

        descriptionList.add("phone 1")
        descriptionList.add("phone 2")
        descriptionList.add("phone 3")
        var adapter = RecyclerAdapter(titleList,imageList,descriptionList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter



    }
}