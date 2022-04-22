package com.example.assignment4
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi


class Admissions : AppCompatActivity() {


    private val addmiss_url: String = "https://online.ucc.edu.jm/programmes/bsc-information-technology/#admission-requierements"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admissions)

        val applyurl: Button = findViewById(R.id.button_apply)
        applyurl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(addmiss_url))
            startActivity(intent)

        }
    }
}