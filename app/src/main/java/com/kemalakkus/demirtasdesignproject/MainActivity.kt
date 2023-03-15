package com.kemalakkus.demirtasdesignproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.kemalakkus.demirtasdesignproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val navController = findNavController(R.id.fragmentContainerView)
        binding.bottomNav.setupWithNavController(navController)
        binding.bottomNav.background =
            ContextCompat.getDrawable(this, R.drawable.bottom_nav_bar_background)

    }
}