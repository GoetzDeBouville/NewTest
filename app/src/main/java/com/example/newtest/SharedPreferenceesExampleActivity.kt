package com.example.newtest

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

const val PRACTICUM_EXAMPLE_PREFERENCES = "practicum_example_preferences"
const val EDIT_TEXT_KEY = "key_for_edit_text"

class SharedPreferenceesExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferencees_example)

        val sharedPrefs = getSharedPreferences(PRACTICUM_EXAMPLE_PREFERENCES, MODE_PRIVATE)
        val clearSharedPrefs : SharedPreferences.Editor

        val editText = findViewById<EditText>(R.id.editText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val restoreButton = findViewById<Button>(R.id.restoreButton)

        editText.setText(sharedPrefs.getString(EDIT_TEXT_KEY, ""))

        saveButton.setOnClickListener {
            sharedPrefs.edit()
                .putString(EDIT_TEXT_KEY, editText.editableText.toString())
                .apply()

            Toast.makeText(this, "Saved valued of editTest ${editText.editableText}", Toast.LENGTH_SHORT)
                .show()
        }
        restoreButton.setOnClickListener {
            editText.setText(sharedPrefs.getString(EDIT_TEXT_KEY, ""))
        }
    }
}