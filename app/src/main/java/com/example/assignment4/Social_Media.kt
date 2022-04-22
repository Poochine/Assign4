package com.example.assignment4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Social_Media : AppCompatActivity() {

    private val fb_url: String = "https://www.facebook.com/uccjamaica"
    private val insta_url :String = "http://www.instagram.com/uccjamaica"
    private val youtube_url :String = "https://www.youtube.com/user/uccjamaica"
    private val twitter_url : String = "https://twitter.com/uccjamaica"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)

        //Launches ucc facebook
        val fburl: Button = findViewById(R.id.button_facebook)
        fburl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(fb_url))
            startActivity(intent)
        }
        //Launches ucc instagram
        val instaurl: Button = findViewById(R.id.button_instagram)
        instaurl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(insta_url))
            startActivity(intent)
        }
        //Launches ucc twitter
        val twitterurl: Button = findViewById(R.id.button_twiiter)
        twitterurl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(twitter_url))
            startActivity(intent)
        }
        //Launches ucc youtube
        val utubeurl: Button = findViewById(R.id.button_youtube)
        utubeurl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(youtube_url))
            startActivity(intent)
        }


    }
}






