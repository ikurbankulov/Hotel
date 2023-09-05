package com.example.hotel.domain.models

data class Booking(
    val departureCity: String,
    val arrivalCity: String,
    val bookingDates: List<String>,
    val hotelName: String,
    val roomName: String,
    val mealPlan: String
)