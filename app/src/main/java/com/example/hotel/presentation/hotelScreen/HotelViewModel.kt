package com.example.hotel.presentation.hotelScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hotel.data.HotelRepositoryImpl
import com.example.hotel.domain.models.Hotel
import com.example.hotel.domain.useCases.GetHotelData
import kotlinx.coroutines.launch

class HotelViewModel() : ViewModel() {

    private val repository = HotelRepositoryImpl()

    private val hotelData = GetHotelData(repository)

    private val _hotel = MutableLiveData<Hotel>()
    val hotel: LiveData<Hotel> = _hotel

    init {
        loadHotel()
    }

    private fun loadHotel() {
        viewModelScope.launch {
            val hotel = hotelData.getHotelData()
            _hotel.postValue(hotel)
        }
    }
}