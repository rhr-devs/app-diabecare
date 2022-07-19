package com.example.android.diabecare.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.diabecare.repository.Repository
import com.example.android.diabecare.viewModels.HomeViewModel

class HomeViewModelFactory(private val repository: Repository): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(repository) as T
    }

}