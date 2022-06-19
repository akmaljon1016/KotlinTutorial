package com.kotlintutorial.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import com.kotlintutorial.app.databinding.ActivityDetailedBinding
import com.kotlintutorial.app.model.Lesson

class DetailedActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val htmlText = intent.extras?.getParcelable<Lesson>("lesson")?.lesson.toString().replace("\n","<br>")
        binding.textview.text = HtmlCompat.fromHtml(htmlText, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}
