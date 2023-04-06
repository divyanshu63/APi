package com.example.api.api

import android.service.autofill.UserData
import android.util.Log
import android.widget.Toast
import com.example.api.modals.Userdata

import com.example.apitask.modals.getUser
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class RestApiService {
    fun addUser(userData: Userdata, onResult:(Userdata?) ->Unit){
        val retrofit = ServiceBuilder.buildService(Restapi::class.java)
        retrofit.addUser(userData).enqueue(
            object : Callback<Userdata>{
                override fun onFailure(call: Call<Userdata>, t: Throwable) {
                    onResult(null)
                }

                override fun onResponse(call: Call<Userdata>, response: Response<Userdata>) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }

            }
        )
    }
    fun getPost(){
        val retrofit = ServiceBuilder.buildService(Restapi::class.java)
        retrofit.getUser().enqueue(

            object : Callback<getUser> {
                override fun onResponse(call: Call<getUser>, response: Response<getUser>) {
                Log.d("call", call.toString())
                Log.d("response",response.toString())
                }

                override fun onFailure(call: Call<getUser>, t: Throwable) {

                }

                }

        )
    }
}
/*
funprivate fun <T> Call<T>.enqueue(callback: Callback<getUser>) {

}*/

//private fun <T> Call<T>.enqueue(callback: Callback<getUser>) {
//
//}
