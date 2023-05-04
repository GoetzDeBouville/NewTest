package com.example.newtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToSecondActivityButton = findViewById<Button>(R.id.buttonToSecondActivity)
        val goToPrimeNums = findViewById<Button>(R.id.buttonToPrimeNums)

        goToSecondActivityButton.setOnClickListener {
            val message = "New message HERE"
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("EXTRA_MESSAGE", message)
            }
            startActivity(intent)
        }
        
        goToPrimeNums.setOnClickListener {
            val goToPrimes = Intent(this, PrimeNumsActivity::class.java)
            startActivity(goToPrimes)
        }
    }
}