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
        val gotoColorActivity = findViewById<Button>(R.id.BtnToColorActivity)

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
            val toSecondRecycleView = Intent(this, SecondRecycleViewExampleActivity::class.java)
            startActivity(toSecondRecycleView)
        }
        gotoColorActivity.setOnClickListener {
            val toColorActivity = Intent(this, ColorActivity::class.java)
            startActivity(toColorActivity)
        }
    }
}