package com.RaghadCalc.calculator2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.RaghadCalc.calculator2.databinding.ActivityLoginScreenBinding

class loginScreen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.tvSignup.setOnClickListener {
            val intent = Intent(this , RegesterationScreen::class.java)
            startActivity(intent)
            finish()
        }

    }
}