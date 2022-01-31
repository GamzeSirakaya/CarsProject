package com.example.carsproject.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carsproject.model.Cars
import com.example.carsproject.model.CarsItem
import com.example.carsproject.repo.CarsRepository
import kotlinx.coroutines.launch

class CarListViewModel : ViewModel() {

    private val _carList = MutableLiveData<List<Cars>>()

    val carList: LiveData<List<Cars>>
        get() = _carList

    init {
        getCarList()
    }

    private fun getCarList() {
        viewModelScope.launch {
            _carList.value = CarsRepository().getCars()

            Log.d("DATA: ", carList.value?.size.toString())
        }

    }

}