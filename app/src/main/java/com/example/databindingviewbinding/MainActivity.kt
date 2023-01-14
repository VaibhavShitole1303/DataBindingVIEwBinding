package com.example.databindingviewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtName.text="welcome To Android"
        binding.btnSetName.text = "Welcome to Andriod"
        binding.btnSetName.setOnClickListener {
        binding.txtName.text = "welcome " + binding.edtName.text.toString()
        binding.imgLogo.setImageResource(R.mipmap.ic_launcher)
    }
        binding.btnShowUserDetails.setOnClickListener{
            var user=User(
                R.mipmap.ic_launcher,
                "Vaibhav",
                1,
                2000,
                "vaibhavShitole@gmail.com"
            )
            var intent:Intent=Intent(this,UserDetailsActivity::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }
    }
}