package com.example.hotel.domain.useCases

import com.example.hotel.domain.HotelRepository
import com.example.hotel.domain.models.Booking

class GetBookingData(private val hotelRepository: HotelRepository) {
    suspend fun getBookingData(): Booking {
        return hotelRepository.getBookingData()
    }
}
