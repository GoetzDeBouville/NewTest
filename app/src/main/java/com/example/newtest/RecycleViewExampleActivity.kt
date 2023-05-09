package com.example.newtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager


class RecycleViewExampleActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view_example)

        var todoList = mutableListOf(
            Todo("Reade the course", false),
            Todo("Watch the movie", false),
            Todo("Send email", false),
            Todo("Buy a copter", false),
            Todo("Share the magazine", true),
            Todo("Feed the dog", false),
            Todo("Take a shower", false),
            Todo("Wash the dish", false)
        )
        val adapter = TodoAdapter(todoList)
        val rvTodos = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.rvTodos)
        val btnAddTodo = findViewById<Button>(R.id.btnAddTodo)
        val etTodo = findViewById<EditText>(R.id.etTodo)

        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }
    }
}

