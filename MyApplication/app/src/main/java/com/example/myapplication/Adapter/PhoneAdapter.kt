package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class PhoneAdapter(var nameList: ArrayList<String>, var imageList: ArrayList<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(position: Int): Any? {
        return null

    }

    override fun getItemId(position: Int): Long {
        return 0

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = LayoutInflater.from(parent!!.context)
                .inflate(R.layout.sample_grid_view_1, parent, false)

            var name : TextView = view . findViewById (R.id.textView4)
        var image: ImageView = view.findViewById(R.id.imageView)

        name.text = nameList[position]
        image.setImageResource(imageList[position])

        return view


    }
}