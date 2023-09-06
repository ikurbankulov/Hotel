package com.example.hotel.data.mapper
import com.example.hotel.data.HotelDto
import com.example.hotel.domain.models.AboutTheHotel
import com.example.hotel.domain.models.Hotel

class Mapper {

    fun mapHotelDtoToDomain(hotelDto: HotelDto): Hotel {
        return Hotel(
            id = hotelDto.id,
            name = hotelDto.name,
            address = hotelDto.address,
            minimalPrice = hotelDto.minimalPrice,
            priceForIt = hotelDto.priceForIt,
            rating = hotelDto.rating,
            ratingName = hotelDto.ratingName,
            imageUrls = hotelDto.imageUrls,
            aboutTheHotel = mapAboutTheHotelToDomain(hotelDto.aboutTheHotel)
        )
    }

    private fun mapAboutTheHotelToDomain(aboutTheHotelDto: AboutTheHotel): AboutTheHotel {
        return AboutTheHotel(
            description = aboutTheHotelDto.description,
            peculiarities = aboutTheHotelDto.peculiarities
        )
    }
}
