package com.example.hotel.domain.useCases

import com.example.hotel.domain.HotelRepository

class UpdateCustomerInfo(private val hotelRepository: HotelRepository) {
    suspend fun updateCustomerInfo(phoneNumber: String, email: String): Boolean {
        return hotelRepository.updateCustomerInfo(phoneNumber, email)
    }
}
