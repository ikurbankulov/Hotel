package com.example.hotel.domain

import com.example.hotel.domain.models.Booking
import com.example.hotel.domain.models.Hotel
import com.example.hotel.domain.models.Room
import com.example.hotel.domain.models.Tourist

interface HotelRepository {

    suspend fun getHotelData(): Hotel

    suspend fun getRoomData(): List<Room>

    suspend fun getBookingData(): Booking

    suspend fun updateCustomerInfo(phoneNumber: String, email: String): Boolean

    suspend fun addTourist(tourist: Tourist): Boolean

    suspend fun makePayment(): Boolean

}

