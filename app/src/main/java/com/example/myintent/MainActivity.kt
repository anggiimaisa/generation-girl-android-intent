package com.example.myintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Handling Button Submit Click
        binding.btnSubmit.setOnClickListener {
            submit()
        }
    }

    private fun submit() {
        val name = binding.etName.text.toString()
        val age = binding.etAge.text.toString()
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(ResultActivity.EXTRA_NAME, name)
        intent.putExtra(ResultActivity.EXTRA_AGE, age)
        startActivity(intent)
    }
}