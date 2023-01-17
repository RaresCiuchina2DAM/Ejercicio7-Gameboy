package com.example.gameboybasica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gameboybasica.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView.setImageResource(R.drawable.inicio)

        binding.BtnGuerrero.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.guerrero)
        }

        binding.btnMago.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.mago)
        }

        binding.btnElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
        }

        binding.btnLadron.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.descarga)
        }

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this, Actividad2::class.java)
            startActivity(intent)
        }


    }
}