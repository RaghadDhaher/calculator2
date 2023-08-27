package com.RaghadCalc.calculator2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.RaghadCalc.calculator2.databinding.ActivityRegesterationScreenBinding

class RegesterationScreen : AppCompatActivity() {

    private lateinit var binding: ActivityRegesterationScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegesterationScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegster.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, loginScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}