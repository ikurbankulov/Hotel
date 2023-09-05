package com.example.hotel.domain.useCases

import com.example.hotel.domain.HotelRepository
import com.example.hotel.domain.models.Hotel

class GetHotelData(private val hotelRepository: HotelRepository) {
    suspend fun getHotelData(): Hotel {
        return hotelRepository.getHotelData()
    }

}