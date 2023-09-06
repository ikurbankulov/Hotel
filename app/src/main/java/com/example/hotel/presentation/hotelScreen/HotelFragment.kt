package com.example.hotel.presentation.hotelScreen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.example.hotel.R
import com.example.hotel.databinding.FragmentHotelBinding
import com.example.hotel.presentation.hotelRoomScreen.HotelRoomFragment
import com.example.hotel.presentation.hotelScreen.adapter.ViewPagerAdapter
import com.google.android.material.chip.Chip
import com.google.android.material.tabs.TabLayoutMediator


class HotelFragment : Fragment() {

    private lateinit var viewModel: HotelViewModel
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    private var _binding: FragmentHotelBinding? = null
    private val binding: FragmentHotelBinding
        get() = _binding ?: throw RuntimeException("FragmentHotelBinding is null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHotelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[HotelViewModel::class.java]
        viewPagerAdapter = ViewPagerAdapter()
        binding.viewPager.adapter = viewPagerAdapter
        setButtonClickListener()
        setContent()

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
        }.attach()
    }

    private fun setContent() {
        viewModel.hotel.observe(viewLifecycleOwner) { hotel ->
            Log.d("ActivityMain", hotel.toString())

            viewPagerAdapter.submitList(hotel.imageUrls)

            with(binding) {
                hotelName.text = hotel.name
                tvAddress.text = hotel.address
                tvPrice.text = getString(R.string.price_template, hotel.minimalPrice)
                tvRating.text =
                    getString(R.string.rating_template, hotel.rating.toString(), hotel.ratingName)
                tvDescription.text = hotel.aboutTheHotel.description

                val peculiarities = hotel.aboutTheHotel.peculiarities
                for (peculiarity in peculiarities) {
                    val chip = Chip(requireContext())
                    with(chip) {
                        isClickable = false
                        text = peculiarity
                        chipBackgroundColor = ContextCompat.getColorStateList(
                            requireContext(),
                            R.color.chip_background_color
                        )
                        chipStrokeColor = ContextCompat.getColorStateList(
                            requireContext(), R.color.chip_background_color
                        )
                        setTextColor(
                            ContextCompat.getColorStateList(
                                requireContext(), R.color.chip_text_color
                            )
                        )
                    }

                    chipGroup.chipSpacingVertical = -12
                    chipGroup.addView(chip)
                }
            }
        }
    }

    private fun setButtonClickListener() {
        binding.buttonSelectHotel.setOnClickListener {
            val fragment = HotelRoomFragment.newInstance()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}