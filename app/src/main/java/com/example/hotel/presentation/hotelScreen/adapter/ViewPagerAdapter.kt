package com.example.hotel.presentation.hotelScreen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.bumptech.glide.Glide
import com.example.hotel.databinding.ViewPagerItemBinding

class ViewPagerAdapter :
    ListAdapter<String, ViewPagerHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding =
            ViewPagerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val imageUrl = getItem(position)
        Glide.with(holder.itemView.context)
            .load(imageUrl)
            .into(holder.binding.hotelImage)
    }
}
// TODO:  ViewPagerSnapHelper