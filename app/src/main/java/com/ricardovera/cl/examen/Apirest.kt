package com.ricardovera.cl.examen


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Apirest {
    private const val BASE_URL = "https://mindicador.cl/api/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)

}