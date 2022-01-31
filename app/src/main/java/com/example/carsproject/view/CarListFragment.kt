package com.example.carsproject.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.carsproject.R
import com.example.carsproject.databinding.CarListFragmentBinding
import com.example.carsproject.viewModel.CarListViewModel

class CarListFragment : Fragment(R.layout.car_list_fragment) {
    private lateinit var carListFragmentBinding: CarListFragmentBinding
    private lateinit var carListViewModel: CarListViewModel


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = CarListFragmentBinding.bind(view)
        carListFragmentBinding = binding
        carListViewModel = ViewModelProvider(this).get(CarListViewModel::class.java)
        println("xxx" + (carListViewModel.carList.value?.size))
        super.onViewCreated(view, savedInstanceState)
    }
}
