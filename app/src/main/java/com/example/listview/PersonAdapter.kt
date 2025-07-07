package com.example.listview

import android.content.Context
import android.provider.ContactsContract.Profile
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class PersonAdapter (context: Context,private val profileList: List<Person>)
    :ArrayAdapter<Person>(context,R.layout.card,profileList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView = convertView
        if (itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.card, parent, false)
        }

        val profile = profileList[position]


        val imageViewProfile = itemView!!.findViewById<CircleImageView>(R.id.profileImage)
        val nameView = itemView.findViewById<TextView>(R.id.nameText)
        val ageView = itemView.findViewById<TextView>(R.id.ageText)

        imageViewProfile.setImageResource(profile.imageResId)
        nameView.text = profile.name
        ageView.text = profile.age
        return itemView
    }

}