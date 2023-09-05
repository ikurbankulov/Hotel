package com.example.hotel.domain.useCases

import com.example.hotel.domain.HotelRepository
import com.example.hotel.domain.models.Room

class GetRoomData(private val hotelRepository: HotelRepository) {
    suspend fun getRoomData(): List<Room> {
        return hotelRepository.getRoomData()
    }
}
