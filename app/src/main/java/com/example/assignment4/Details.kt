package com.example.assignment4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //Gets value sent from Directory activity
        val index: String? = this.intent.getStringExtra("listIndex")

        //Creates objects for each activity element
        val name: TextView = findViewById(R.id.tvName)
        val email: TextView = findViewById(R.id.tvEmail)
        val phone: TextView = findViewById(R.id.txtTel)
        val photo: ImageView = findViewById(R.id.ivProfile)


        //Assigns value to elements according to retrieved index
        when(index){
            "0" -> {
                name.text = "Ms.Natalie Rose"
                email.text = "ithod@ucc.edu.jm"
                phone.text = "876-838-2408"
                photo.setImageResource(R.drawable.msrose)
            }
            "1" -> {
                name.text = "Mr. Otis Osbourne"
                email.text = "businessadminhod@ucc.edu.jm"
                photo.setImageResource(R.drawable.mrosbourne)
            }
            "2" -> {
                name.text = "Mr. Neil Williams"
                email.text = "graduatestudiesdirector@ucc.edu.jm"
                //photo.setImageResource(R.drawable.amonde)
            }
            "3" -> {
                name.text = "Mr. Fitzroy Gordon"
                email.text = "appliedpsychologyfaculty@ucc.edu.jm"
                //photo.setImageResource(R.drawable.miller)
            }
            "4" -> {
                name.text = "Mr. Cecil White"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                //photo.setImageResource(R.drawable.ndajah)
            }
            "5" -> {
                name.text = "Ms. Rochelle Mcbean"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                //photo.setImageResource(R.drawable.ndajah)
            }
            "6" -> {
                name.text = "Mr. Stephan Gentles"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                //photo.setImageResource(R.drawable.ndajah)
            }
            "7" -> {
                name.text = "Mr. Nathan Young"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                //photo.setImageResource(R.drawable.ndajah)
            }
            "8" -> {
                name.text = "Mr. Neil Williams"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                //photo.setImageResource(R.drawable.ndajah)
            }
            "9" -> {
                name.text = "Ms. Sydia Brown"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                //photo.setImageResource(R.drawable.ndajah)
            }
            "10" -> {
                name.text = "Ms. Karen Wilson"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                //photo.setImageResource(R.drawable.ndajah)
            }
        }

        //Launches email client when email address is tapped
        email.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", email.toString(), null))
            intent.putExtra(Intent.EXTRA_EMAIL, email.toString())
            startActivity(intent)
        }
    }
}