package com.example.databindingviewbinding

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.databindingviewbinding.databinding.ActivityMainBinding
import com.example.databindingviewbinding.databinding.UserdetailsBinding

class UserDetailsActivity:AppCompatActivity() {
    private lateinit var binding: UserdetailsBinding
    private lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=UserdetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindDataToView()
    }

    private fun bindDataToView() {
       user=intent.getSerializableExtra("user") as User
        binding.userObject=user
    }
}