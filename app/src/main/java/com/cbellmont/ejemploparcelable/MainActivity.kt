package com.cbellmont.ejemploparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cbellmont.ejemploparcelable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bSend.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE_1", ExampleClass("Clase Pacelable de ejemplo"))
            startActivity(intent)
        }
    }
}