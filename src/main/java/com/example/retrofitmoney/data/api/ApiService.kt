package com.example.retrofitmoney.data.api

import com.example.retrofitmoney.model.cash.Cash
import com.example.retrofitmoney.model.cash.CashItem
import com.example.retrofitmoney.model.cashless.Cashless
import com.example.retrofitmoney.model.cashless.CashlessItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashMoneys():Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getCashlessMoneys():Response<Cashless>
}