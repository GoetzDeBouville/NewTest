package com.example.newtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class PrimeNumsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prime_nums)

        val linearLayout = findViewById<LinearLayout>(R.id.container)
        val inputEditText = findViewById<EditText>(R.id.inputEditText)
        val clearButton = findViewById<ImageView>(R.id.clearIcon)

        clearButton.setOnClickListener {
            inputEditText.setText("")
        }
        val simpleTextWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // empty
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s.isNullOrEmpty()) {
                    linearLayout.setBackgroundColor(getColor(R.color.prime_neutral))
                } else {
                    val input = s.toString()
                    if (isPrime(input.toInt())) {
                        linearLayout.setBackgroundColor(getColor(R.color.prime_positive))
                    } else {
                        linearLayout.setBackgroundColor(getColor(R.color.prime_negative))
                    }
                }
                clearButton.visibility = clearButtonVisibility(s)
            }

            override fun afterTextChanged(s: Editable?) {
                // empty
            }
        }
        //добавляем созданный simpleTextWatcher к EditText
        inputEditText.addTextChangedListener(simpleTextWatcher)

        val image = findViewById<ImageView>(R.id.image2)
        image.setImageDrawable(getDrawable(R.drawable.multy_gradient))
        image.scaleType = ImageView.ScaleType.CENTER_CROP
        image.setImageResource(R.drawable.hamster_image)
    }

    private fun clearButtonVisibility(s: CharSequence?): Int {
        return if (s.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    private fun isPrime(number: Int): Boolean {
        for (i in 2..kotlin.math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }
}