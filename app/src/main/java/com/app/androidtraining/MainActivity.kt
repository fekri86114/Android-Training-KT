package com.app.androidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.androidtraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onCheckBoxClicked()

        binding.favoriteBtn.setOnClickListener {

            binding.tehranCheckbox.isChecked = true
            binding.ardabilCheckbox.isChecked = true

        }
    }

    private fun onCheckBoxClicked() {

        binding.tehranCheckbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Tehran selected!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Tehran is not checked!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.isfahanCheckbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Isfahan selected!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Isfahan is not checked!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.ardabilCheckbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Ardabil selected!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ardabil is not checked!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.ilamCheckbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Ilam selected!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ilam is not checked!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.mashhadCheckbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Mashhad is checked!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Mashhad is not checked!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}