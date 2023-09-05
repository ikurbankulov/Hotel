package com.example.hotel.domain.useCases

import com.example.hotel.domain.HotelRepository

class MakePayment(private val hotelRepository: HotelRepository) {
    suspend fun makePayment(): Boolean {
        return hotelRepository.makePayment()
    }
}
