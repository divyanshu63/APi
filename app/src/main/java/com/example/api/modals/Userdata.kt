package com.example.api.modals


import com.google.gson.annotations.SerializedName

data class Userdata (


        @SerializedName("name" ) var name : String? = null,
        @SerializedName("job"  ) var job  : String? = null
)


