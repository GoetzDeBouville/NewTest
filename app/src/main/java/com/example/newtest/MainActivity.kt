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
        val goToListExampoleActivity = findViewById<Button>(R.id.buttonListActivityExample)
        val goToRecycleViewExample = findViewById<Button>(R.id.buttonToRecycleView)
        val goToSecondRecycleView = findViewById<Button>(R.id.buttonToSecondRecycleView)
        val goToColorActivity = findViewById<Button>(R.id.btnToColorActivity)
        val goToImageViewExampleActivity = findViewById<Button>(R.id.btnToImageViewExampleActivity)
        val goToGlideTestActivity = findViewById<Button>(R.id.btnToGlideTestActivity)
        val goToForecast = findViewById<Button>(R.id.btnToForecast)

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

        goToListExampoleActivity.setOnClickListener {
            val goToExampleList = Intent(this, ListExampleActivity::class.java)
            startActivity(goToExampleList)
        }
        goToRecycleViewExample.setOnClickListener {
            val goToReycleView = Intent(this, CommentRecycleViewExampleActivity::class.java)
            startActivity(goToReycleView)
        }

        goToSecondRecycleView.setOnClickListener{
            val toSecondRecycleView = Intent(this, RecycleViewExampleActivity::class.java)
            startActivity(toSecondRecycleView)
        }
        goToColorActivity.setOnClickListener {
            val toColorActivity = Intent(this, ColorActivity::class.java)
            startActivity(toColorActivity)
        }

        goToImageViewExampleActivity.setOnClickListener {
            val toViewHolderActivity = Intent(this, ImageViewExampleActivity::class.java)
            startActivity(toViewHolderActivity)
        }

        goToGlideTestActivity.setOnClickListener {
            val toGlideTestActivity = Intent(this, GlideTestActivity::class.java)
            startActivity(toGlideTestActivity)
        }
        goToForecast.setOnClickListener {
            val goToForecast = Intent(this, ForecastActivity::class.java)
            startActivity(goToForecast)
        }
    }
}