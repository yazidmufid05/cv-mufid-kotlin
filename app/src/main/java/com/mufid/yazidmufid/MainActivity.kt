package com.mufid.yazidmufid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.mufid.yazidmufid.data.viewmodels.MainViewModel
import com.mufid.yazidmufid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
            .get(MainViewModel::class.java)

        mainViewModel.getDataProfile()
        setData()
    }

    private fun setData() {
        mainViewModel.profileData.observe(this) {result ->
            binding.tvName.text = result.name
            binding.tvBorn.text = result.born
            binding.tvAddress.text = result.address
        }
    }
}