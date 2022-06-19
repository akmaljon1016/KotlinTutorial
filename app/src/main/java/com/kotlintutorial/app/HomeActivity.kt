package com.kotlintutorial.app

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlintutorial.app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardKotlin.setOnClickListener {
            startActivity(Intent(this, KotlinActivity::class.java))
        }
        binding.cardVideo.setOnClickListener {
            startActivity(Intent(this, VideoDarsActivity::class.java))
        }
        binding.cardPdf.setOnClickListener {
            startActivity(Intent(this, PdfActivity::class.java))
        }
        binding.youtube.setOnClickListener {
            val webIntent: Intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=VEqhzCFmEQI&list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR"));
            try {
                startActivity(webIntent)
            } catch (exception: ActivityNotFoundException) {

            }
        }
    }
}
