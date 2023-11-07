package com.example.battistradagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.battistradagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener{ item ->
            when (item.itemId){
                R.id.navbot_home -> {
                    true
                }
                R.id.navbot_post -> {
                    true
                }
                R.id.navbot_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, ProfileFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}