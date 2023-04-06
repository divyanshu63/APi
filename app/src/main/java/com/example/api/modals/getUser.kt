package com.example.apitask.modals

import com.google.gson.annotations.SerializedName

data class getUser(

    @SerializedName("data"    ) var data    : Subuser?    = Subuser(),
    @SerializedName("support" ) var support : Support? = Support()
)

data class Subuser  (

    @SerializedName("id"         ) var id        : Int?    = null,
    @SerializedName("email"      ) var email     : String? = null,
    @SerializedName("first_name" ) var firstName : String? = null,
    @SerializedName("last_name"  ) var lastName  : String? = null,
    @SerializedName("avatar"     ) var avatar    : String? = null

)

data class Support (

    @SerializedName("url"  ) var url  : String? = null,
    @SerializedName("text" ) var text : String? = null

)
