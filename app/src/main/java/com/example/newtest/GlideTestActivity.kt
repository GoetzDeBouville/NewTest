package com.example.newtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.RoundedCorner
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class GlideTestActivity : AppCompatActivity() {

    private val imageUrl = "https://unsplash.com/photos/5OUkGZxpXTo/download?ixid=MnwxMjA3fDB8MXxhbGx8MTQ4fHx8fHx8Mnx8MTY4MzU1OTg1OA&force=true&w=640"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide_test)

        val image = findViewById<ImageView>(R.id.image)
//        image.scaleType = ImageView.ScaleType.CENTER_CROP

        Glide.with(applicationContext)
            .load(imageUrl)
            .centerCrop() //? вызов метода форматирования изображения виесто image.scaleType = ImageView.ScaleType.CENTER_CROP
            .transform(RoundedCorners(100))
            .placeholder(R.drawable.hamster_image)
            .into(image)
    }
}