package com.cbellmont.ejemploparcelable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cbellmont.ejemploparcelable.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val exampleItem = intent.getParcelableExtra<ExampleClass>("VALUE_1")
        exampleItem?.let {
            binding.tvParcelable.text = it.content
        }

    }
}