package com.example.newtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.SpinnerAdapter
import kotlin.random.Random

class ListExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_example)


        val spinnerExample = findViewById<Spinner>(R.id.spinnerExample)
        val listOfSpinnerElements = listOf("First", "Second", "Third", "Fourth", "Fifth")
        val adapterSpinnerElements: SpinnerAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, listOfSpinnerElements
        )
        spinnerExample.adapter = adapterSpinnerElements


        val gridViewExample = findViewById<GridView>(R.id.gridViewExample)
        val basicElements = listOf("Ferrari", "Renault", "BMW", "Mclaren", "Ford", "Alfa Romeo")
        val gridElenmetsGenerator = List(12){
            basicElements[Random.nextInt(0, 5)]
        }
        val adapterGridView: ListAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, gridElenmetsGenerator
        )
        gridViewExample.adapter = adapterGridView


        val listViewExample = findViewById<ListView>(R.id.listViewExample)
        // Используем тот же список basicElements
        val listViewElenmetsGenerator = List(12){
            basicElements[Random.nextInt(0, 5)]
        }
        val adapterListView: ListAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, listViewElenmetsGenerator
        )
        listViewExample.adapter = adapterListView
    }
}