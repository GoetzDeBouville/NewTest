package com.example.newtest

import android.annotation.SuppressLint
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newtest.databinding.ActivityNewRecyclerExampleBinding
import com.example.newtest.databinding.ItemPersonNewExampleBinding
import com.example.newtest.App
import com.example.newtest.newrecyclerexample.PersonAdapter
import com.example.newtest.newrecyclerexample.PersonService

class NewRecyclerExample : AppCompatActivity() {

    private lateinit var binding: ActivityNewRecyclerExampleBinding
    private lateinit var adapter: PersonAdapter
    private val personService: PersonService
        get() = (applicationContext as App).personService

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRecyclerExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        adapter = PersonAdapter()

        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = adapter

        adapter.data = personService.getPersons() // Заполнение данными
        adapter.notifyDataSetChanged() // Уведомление об изменении данных
    }
}
class App : Application() {
    val personService = PersonService()
}