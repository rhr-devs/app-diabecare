package com.example.android.diabecare.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.diabecare.models.PredictionResult
import com.example.android.diabecare.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel(private val repository: Repository) : ViewModel() {
    var response = MutableLiveData<String>()

    fun getPrediction(
        pregnancy: Int,
        glucose:Int,
        insulin:Int,
        bloodPressure:Int,
        skinThickness:Int,
        bmi:Int,
        diabetesPedigreeFunction:Int,
        age:Int,
    ){
        viewModelScope.launch {
            response = repository.getPredictionFromRepository(pregnancy, glucose,bloodPressure,skinThickness,insulin,bmi,diabetesPedigreeFunction,age)
        }
    }


    fun getResult(): MutableLiveData<String> {
        return response
    }
}