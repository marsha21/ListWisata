package com.example.listwisata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    companion object {
        const val NAMA = "detailWisata"
        const val LOCATION = "detailLocation"
        const val DETAIL = "detailDetail"
        const val IMAGE = "detailImg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvWisata: TextView = findViewById(R.id.detailWisata)
        val tvLocation: TextView = findViewById(R.id.detailLocation)
        val tvDetail: TextView = findViewById(R.id.detailDetail)
        val tvImage: ImageView = findViewById(R.id.detailImg)

        val dWisata = intent.getStringExtra(NAMA)
        val dLocation = intent.getStringExtra(LOCATION)
        val dDetail = intent.getStringExtra(DETAIL)
        val dImg = intent.getIntExtra(IMAGE, 0)

        tvWisata.text = dWisata
        tvLocation.text = dLocation
        tvDetail.text = dDetail

        Glide.with(this)
            .load(dImg)
            .apply(RequestOptions())
            .into(tvImage)
    }
}