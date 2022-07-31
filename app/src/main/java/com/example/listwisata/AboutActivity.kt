package com.example.listwisata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val profileImg: ImageView = findViewById(R.id.profileImg)
        val pImg = R.drawable.user1

        Glide.with(this)
            .load(pImg)
            .apply(RequestOptions())
            .into(profileImg)
    }
}