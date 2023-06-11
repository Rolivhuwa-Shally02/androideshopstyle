package com.example.android_beta_e_commerce

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/products")
    fun getData(): Call<List<ProductsItem>>
}