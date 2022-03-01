package com.example.retrofitmoney.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitmoney.data.repository.Repository
import com.example.retrofitmoney.model.cash.Cash
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Cash>> = MutableLiveData()

    fun getCashMoney(){
        viewModelScope.launch {
            myMoneyList.value =repo.getNal()
        }
    }
}