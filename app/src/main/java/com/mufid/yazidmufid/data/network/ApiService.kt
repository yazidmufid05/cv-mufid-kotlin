package com.mufid.yazidmufid.data.network

import com.mufid.yazidmufid.data.ProfileResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("aaf92cb86949db8d1a98 ")
    fun getMyProfile(): Call<ProfileResponse>
}