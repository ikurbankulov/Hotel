package com.example.hotel.domain.models

import com.example.hotel.domain.AboutTheHotel

data class Hotel(
    val id: Int,
    val name: String,
    val address: String,
    val minimalPrice: Int,
    val priceForIt: String,
    val rating: Int,
    val ratingName: String,
    val imageUrls: List<String>,
    val aboutTheHotel: AboutTheHotel
)


