package com.example.newtest

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView

class ImageViewExampleActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view_example)

        val image = findViewById<ImageView>(R.id.image)
        image.setBackgroundColor(getColor(R.color.black))
        image.setImageResource(R.drawable.hamster_image)
    }
}