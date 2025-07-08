package com.example.listview

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract.Profile
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listview.databinding.CardBinding
import de.hdodenhof.circleimageview.CircleImageView

class PersonAdapter (context: Context,private val profileList: List<Person>)
    :ArrayAdapter<Person>(context,R.layout.card,profileList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


//        var itemView = convertView
//        if (itemView == null){
//            itemView = LayoutInflater.from(context).inflate(R.layout.card, parent, false)
//        }
//
//        val profile = profileList[position]
//
//
//        val imageViewProfile = itemView!!.findViewById<CircleImageView>(R.id.profileImage)
//        val nameView = itemView.findViewById<TextView>(R.id.nameText)
//        val ageView = itemView.findViewById<TextView>(R.id.ageText)
//
//        imageViewProfile.setImageResource(profile.imageResId)
//        nameView.text = profile.name
//        ageView.text = profile.age
//
//
//        itemView.setOnClickListener{
//            val intent = Intent(context,ProfileDemo::class.java)
//            intent.putExtra("Profile",profile.imageResId)
//            intent.putExtra("Name",profile.name)
//            context.startActivity(intent)
//        }
//        return itemView
//    }

        val binding: CardBinding
        val view: View
        if (convertView == null) {
            binding = CardBinding.inflate(LayoutInflater.from(context), parent, false)
            view = binding.root
            view.tag = binding
        } else {
            view = convertView
            binding = view.tag as CardBinding
        }

        val profile = profileList[position]


        binding.profileImage.setImageResource(profile.imageResId)
        binding.nameText.text = profile.name
        binding.ageText.text = profile.age

        view.setOnClickListener{
            val intent = Intent(context,ProfileDemo::class.java)
            intent.putExtra("Profile",profile.imageResId)
            intent.putExtra("Name",profile.name)
            context.startActivity(intent)
        }

        return view
    }

}