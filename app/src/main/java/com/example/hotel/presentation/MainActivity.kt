package com.example.hotel.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotel.R
import com.example.hotel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_hotel)
    }
}