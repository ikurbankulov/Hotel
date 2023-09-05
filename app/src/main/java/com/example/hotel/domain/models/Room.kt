package com.example.hotel.domain.models

data class Room(
    val roomNumber: String,
    val roomType: String,
    val amenities: List<String>,
    val pricePerNight: Double,
    val isAvailable: Boolean
)