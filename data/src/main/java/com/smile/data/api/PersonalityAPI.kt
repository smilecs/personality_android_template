package com.smile.data.api

import com.smile.data.entity.DemoResponse
import retrofit2.Call
import retrofit2.http.POST

interface PersonalityAPI {

    @POST
    fun getDemoData(): Call<DemoResponse>

}