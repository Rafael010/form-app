package com.example.formapp.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.formapp.R

class AdapterGallery(private var context: Context?, private var data: ArrayList<String>) :
    RecyclerView.Adapter<ViewHolderGallery>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderGallery {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_gallery, parent, false)
        return ViewHolderGallery(view)
    }

    override fun onBindViewHolder(holder: ViewHolderGallery, position: Int) {
        val imageUrl = data[position]
        Glide.with(context!!).load(imageUrl).into(holder.galleryImage)
        holder.galleryImage.setOnClickListener {it.findNavController().navigate(R.id.action_ToComplaint)}
    }

    override fun getItemCount(): Int {
        return data.size
    }
}