package com.example.formapp.ui

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.formapp.R


class ViewHolderGallery(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var galleryImage: ImageView

    init {
        galleryImage = itemView.findViewById(R.id.gallery_image)
    }
}
