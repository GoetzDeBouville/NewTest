package com.example.newtest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
        val shareLinkButton = findViewById<Button>(R.id.shareLinkButton)
        shareLinkButton.setOnClickListener {
            shareLink()
        }



        val sendEmailButton = findViewById<Button>(R.id.sendEmailButton)
        sendEmailButton.setOnClickListener {
            sendEmail()
        }

    }

    private fun shareLink() {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, "https://practicum.yandex.ru/android-developer/")
        startActivity(Intent.createChooser(shareIntent, "Share link"))
    }

    private fun sendEmail() {
        val email = "zinchencko.alexei2018@yandex.ru"
        val subject = "Сообщение разработчикам и разработчицам приложения Playlist Maker"
        val textMessage = "Спасибо разработчикам и разработчицам за крутое приложение!"

        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$email")
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, textMessage)
        }

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "No convienced apps", Toast.LENGTH_SHORT).show()
        }
    }


}