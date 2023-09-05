package com.example.hotel.domain.useCases

import com.example.hotel.domain.HotelRepository
import com.example.hotel.domain.models.Tourist

class AddTourist(private val hotelRepository: HotelRepository) {
    suspend fun addTourist(touristData: Tourist): Boolean {
        return hotelRepository.addTourist(touristData)
    }
}
