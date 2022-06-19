package com.kotlintutorial.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlintutorial.Resource
import com.kotlintutorial.app.adapter.YoutubeVideoAdapter
import com.kotlintutorial.app.databinding.ActivityVideoDarsBinding

class VideoDarsActivity : AppCompatActivity() {
    lateinit var binding: ActivityVideoDarsBinding
    lateinit var adapter:YoutubeVideoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoDarsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter= YoutubeVideoAdapter(lifecycle)
        adapter.submitList(Resource().videos)
        binding.recyclerview.adapter=adapter
    }
}