package com.kotlintutorial.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlintutorial.Resource
import com.kotlintutorial.app.adapter.LessonTitleAdapter
import com.kotlintutorial.app.databinding.ActivityKotlinBinding
import com.kotlintutorial.app.model.Lesson

class KotlinActivity : AppCompatActivity() {
    lateinit var binding: ActivityKotlinBinding
    val lessonTitleAdapter by lazy { LessonTitleAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerview.adapter = lessonTitleAdapter
        lessonTitleAdapter.submitList(Resource().lessons)
        supportActionBar?.title="Kotlin Dars"
        lessonTitleAdapter.setOnItemClickedListener(object :
            LessonTitleAdapter.OnItemClickedListener {
            override fun onItemClicked(lesson: Lesson) {
                val intent = Intent(this@KotlinActivity, DetailedActivity::class.java)
                intent.putExtra("lesson",lesson)
                startActivity(intent)
            }
        })
    }
}