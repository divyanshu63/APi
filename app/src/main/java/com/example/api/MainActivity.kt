package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.api.api.RestApiService
import com.example.api.modals.Userdata

class MainActivity : AppCompatActivity() {
    val apiService = RestApiService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            addDummyUser()
            apiService.getPost()
        }
    }

      private fun addDummyUser() {
           val userInfo = Userdata(
               name = "dk",
               job = "devv"
           )


          apiService.addUser(userInfo) {
              if (it != null) {
                  it.name?.let { it1 -> Log.d("value", it1) }
              }
              }
        }
}

