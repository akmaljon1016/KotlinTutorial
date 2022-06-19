package com.kotlintutorial.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlintutorial.app.R
import com.kotlintutorial.app.databinding.ActivityPdfBinding

class PdfActivity : AppCompatActivity() {
    lateinit var binding:ActivityPdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPdfBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pdfViewer.fromAsset("kotlin.pdf").load()
    }
}