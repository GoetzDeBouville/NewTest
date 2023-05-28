package com.example.newtest

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.newtest.databinding.ActivityMainBinding


@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        backgroundAnimation()

        val goToSecondActivityButton = findViewById<Button>(R.id.buttonToSecondActivity)
        val goToPrimeNums = findViewById<Button>(R.id.buttonToPrimeNums)
        val goToListExampoleActivity = findViewById<Button>(R.id.buttonListActivityExample)
        val goToRecycleViewExample = findViewById<Button>(R.id.buttonToRecycleView)
        val goToSecondRecycleView = findViewById<Button>(R.id.buttonToSecondRecycleView)
        val goToColorActivity = findViewById<Button>(R.id.btnToColorActivity)
        val goToImageViewExampleActivity = findViewById<Button>(R.id.btnToImageViewExampleActivity)
        val goToGlideTestActivity = findViewById<Button>(R.id.btnToGlideTestActivity)
        val goToForecast = findViewById<Button>(R.id.btnToForecast)
        val goToNewRecyclerExample = findViewById<Button>(R.id.btnToNewRecyclerExample)
        val goToSharedPreferences = findViewById<Button>(R.id.btnToSharedPreferences)

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

        goToSecondRecycleView.setOnClickListener {
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
        goToNewRecyclerExample.setOnClickListener {
            val goToNewRecyclerExample = Intent(this, NewRecyclerExample::class.java)
            startActivity(goToNewRecyclerExample)
        }
        goToSharedPreferences.setOnClickListener{
            val goToSharedPreferences = Intent(this, SharedPreferenceesExampleActivity::class.java)
            startActivity(goToSharedPreferences)
        }
    }

    private fun backgroundAnimation() {
        val animationDrawable: AnimationDrawable = binding.rlLayout.background as AnimationDrawable
        animationDrawable.apply {
            setEnterFadeDuration(1000)
            setExitFadeDuration(3000)
            start()
        }
    }
}