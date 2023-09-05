package com.example.hotel.presentation

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hotel.R
import com.example.hotel.data.network.ApiFactory
import com.example.hotel.databinding.ActivityMainBinding
import com.example.hotel.domain.models.Hotel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch(Dispatchers.IO) {
            val response = ApiFactory.apiService.getHotelData()
            Log.d("ActivityMain", response.toString())
        }
    }
}