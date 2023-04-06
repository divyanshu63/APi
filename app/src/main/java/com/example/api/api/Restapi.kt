package com.example.api.api



import android.service.autofill.UserData
import com.example.api.modals.Userdata
import com.example.apitask.modals.getUser
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface Restapi {
    @POST("api/users")
    fun addUser(@Body userData: Userdata): Call<Userdata>

    @GET("api/users/2")
    fun getUser():Call<getUser>

}