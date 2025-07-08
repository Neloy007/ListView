package com.example.listview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listview.databinding.ActivityProfileDemoBinding

class ProfileDemo : AppCompatActivity() {
    private lateinit var binding: ActivityProfileDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        binding = ActivityProfileDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent.getIntExtra("Profile", R.drawable.profile)
        val name = intent.getStringExtra("Name")

        binding.demoProfileCircleView.setImageResource(image)
        binding.demoNameTvProfile.text = name
    }
}