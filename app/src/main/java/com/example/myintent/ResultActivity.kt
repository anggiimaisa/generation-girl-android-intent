package com.example.myintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myintent.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    companion object {
        const val EXTRA_NAME = "NAME"
        const val EXTRA_AGE = "AGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val extraName: String = intent.getStringExtra(EXTRA_NAME) ?: "-"
        val extraAge: String = intent.getStringExtra(EXTRA_AGE) ?: "-"
        binding.tvName.text = extraName
        binding.tvAge.text = "$extraAge Tahun"
    }
}