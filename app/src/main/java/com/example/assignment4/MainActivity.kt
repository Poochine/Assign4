package com.example.assignment4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val mail: String = "ucconline@ucc.edu.jm"
    lateinit var recyclerbtn :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val directory: Button = findViewById(R.id.button_Faculty)
        directory.setOnClickListener {
            val intent = Intent(this, StaffDirectory::class.java)
            startActivity(intent)
        }

        val timeT: Button = findViewById(R.id.button_TimeTable)
        timeT.setOnClickListener {
            val intent = Intent(this, TimeTable::class.java)
            startActivity(intent)
        }

        val admis: Button = findViewById(R.id.button_Admissions)
        admis.setOnClickListener {
            val intent = Intent(this, Admissions::class.java)
            startActivity(intent)
        }

        val course:Button = findViewById(R.id.button_Courses)
        course.setOnClickListener {
            val intent = Intent(this,Courses::class.java)
            startActivity(intent)

        }

        val web: Button = findViewById(R.id.button_Social_Media)
        web.setOnClickListener {
            val intent = Intent(this, Social_Media::class.java)
            startActivity(intent)
        }

        val sendEmail: Button = findViewById(R.id.button_Email)
        sendEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mail, null))
            intent.putExtra(Intent.EXTRA_EMAIL, mail)
            startActivity(intent)
        }

    }

}