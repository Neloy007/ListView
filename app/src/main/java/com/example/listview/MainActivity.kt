package com.example.listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listview.databinding.ActivityMainBinding
import com.example.listview.PersonAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.myListView


                val profileList = listOf(
                    Person(R.drawable.profile,"Neloy", "23"),
                    Person(R.drawable.profile2,"Asha", "20" ),
                    Person(R.drawable.profile3,"Rafi", "19"),
                    Person(R.drawable.profile,"Neloy", "23"),
                    Person(R.drawable.profile2,"Asha", "20" ),
                    Person(R.drawable.profile3,"Rafi", "19"),
                    Person(R.drawable.profile,"Neloy", "23"),
                    Person(R.drawable.profile2,"Asha", "20" ),
                    Person(R.drawable.profile3,"Rafi", "19"),
                    Person(R.drawable.profile,"Neloy", "23"),
                    Person(R.drawable.profile2,"Asha", "20" ),
                    Person(R.drawable.profile3,"Rafi", "19"),
                )

                val adapter = PersonAdapter(this, profileList)
                binding.myListView.adapter = adapter


    }
}