package com.example.newtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class CommentRecycleViewExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comments_recycle_view_example)

        val recycler = findViewById<RecyclerView>(R.id.commentsList)
        val comments = listOf(
            "Вот так новость!",
            "Мне эта новость очень понравилась",
            "Отстой, хомячьи новости уже не те!",
            "Супер!",
            "Когда уже следующий выпуск?",
            "Верните стену!",
            "Приятно читать, благодарю!"
        )

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = CommentAdapter(
            comments = List(100) {
                Comment(
                    Random.nextInt(100_000, 999_999),
                    comments[Random.nextInt(0, comments.size)]
                )
            }
        )
    }
}