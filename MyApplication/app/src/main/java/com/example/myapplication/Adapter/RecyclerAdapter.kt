package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class RecyclerAdapter(
    var titleList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var descriptionList: ArrayList<String>
) : RecyclerView.Adapter<RecyclerAdapter.PhoneViewHolder>() {
    class PhoneViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.textView3)
        var description: TextView = view.findViewById(R.id.textView4)
        var image: ImageView = view.findViewById(R.id.imageView2)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhoneViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.sample_recycler_view_1, parent, false)
        return  PhoneViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        holder.title.text = titleList[position]
        holder.description.text = descriptionList[position]
        holder.image.setImageResource(imageList[position])
    }

    override fun getItemCount(): Int {

        return titleList.size
    }

}