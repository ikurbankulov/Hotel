package com.example.hotel.data

import android.app.Application
import com.example.hotel.data.mapper.Mapper
import com.example.hotel.data.network.ApiFactory
import com.example.hotel.domain.HotelRepository
import com.example.hotel.domain.models.Booking
import com.example.hotel.domain.models.Hotel
import com.example.hotel.domain.models.Room
import com.example.hotel.domain.models.Tourist

class HotelRepositoryImpl : HotelRepository {
    override suspend fun getHotelData(): Hotel {
        val hotelDto = ApiFactory.apiService.getHotelData()
        return Mapper().mapHotelDtoToDomain(hotelDto)
    }

    override suspend fun getRoomData(): List<Room> {
        TODO("Not yet implemented")
    }

    override suspend fun getBookingData(): Booking {
        TODO("Not yet implemented")
    }

    override suspend fun updateCustomerInfo(phoneNumber: String, email: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun addTourist(tourist: Tourist): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun makePayment(): Boolean {
        TODO("Not yet implemented")
    }

}