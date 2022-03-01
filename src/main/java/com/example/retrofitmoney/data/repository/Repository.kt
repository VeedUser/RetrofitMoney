package com.example.retrofitmoney.data.repository

import com.example.retrofitmoney.data.api.RetrofitInstance
import com.example.retrofitmoney.model.cash.Cash
import com.example.retrofitmoney.model.cash.CashItem
import com.example.retrofitmoney.model.cashless.Cashless
import com.example.retrofitmoney.model.cashless.CashlessItem
import retrofit2.Response
import retrofit2.Retrofit

class Repository {

    suspend fun getNal(): Response<Cash>{
        return RetrofitInstance.api.getCashMoneys()
    }
    suspend fun getBezNal(): Response<Cashless>{
        return RetrofitInstance.api.getCashlessMoneys()
    }

}