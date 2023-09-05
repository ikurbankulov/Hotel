package com.example.hotel.domain.models

import com.example.hotel.domain.AboutTheHotel
import com.google.gson.annotations.SerializedName

data class Hotel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("adress")
    val address: String,
    @SerializedName("minimal_price")
    val minimalPrice: Int,
    @SerializedName("price_for_it")
    val priceForIt: String,
    @SerializedName("rating")
    val rating: Int,
    @SerializedName("rating_name")
    val ratingName: String,
    @SerializedName("image_urls")
    val imageUrls: List<String>,
    @SerializedName("about_the_hotel")
    val aboutTheHotel: AboutTheHotel
//    val id: Int,
//    val name: String,
//    val address: String,
//    val minimalPrice: Int,
//    val priceForIt: String,
//    val rating: Int,
//    val ratingName: String,
//    val imageUrls: List<String>,
//    val aboutTheHotel: AboutTheHotel
)


