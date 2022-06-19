package com.kotlintutorial.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.kotlintutorial.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animation: Animation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.entry_anim)
        binding.iconKotlin.startAnimation(animation)
        Handler().postDelayed(Runnable {
            startActivity(Intent(this, HomeActivity::class.java))
        }, 2000)
    }
}