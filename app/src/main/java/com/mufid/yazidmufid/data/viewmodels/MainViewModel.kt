package com.mufid.yazidmufid.data.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mufid.yazidmufid.data.ProfileResponse
import com.mufid.yazidmufid.data.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    private val _profileData = MutableLiveData<ProfileResponse>();
    val profileData: LiveData<ProfileResponse> = _profileData;

    fun getDataProfile() {
        val client = ApiConfig.getApiService().getMyProfile()
        client.enqueue(object: Callback<ProfileResponse>{
            override fun onResponse(
                call: Call<ProfileResponse>,
                response: Response<ProfileResponse>
            ) {
                val data = response.body()
                _profileData.value = data
            }

            override fun onFailure(call: Call<ProfileResponse>, t: Throwable) {
                Log.e("Error", t.message.toString())
            }

        })
    }
}