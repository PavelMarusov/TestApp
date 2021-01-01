package com.example.testapp.ui

import android.widget.ImageView
import com.bumptech.glide.Glide


    fun ImageView.loadImage(url: String) {
        Glide
            .with(this.context)
            .load(url)
            .centerCrop()
            .into(this)
    }