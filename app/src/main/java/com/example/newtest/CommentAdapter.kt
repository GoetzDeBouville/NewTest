package com.example.newtest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CommentAdapter(
    private val comments: List<Comment>
) : RecyclerView.Adapter<CommentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        // * здесь создается и надвуется элемент ViewHolder (LayoutInflater)
        // * comment_view это непосредственное файл layout comment_view.xml
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comment_view, parent, false)
        return CommentViewHolder(view) // * создаём объект CommentViewHolder и передаём туда «надутую» view
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        // * склеивание комментов
        // * вызываем заранее созданный метод bind в CommentViewHolder и передаём ему в качестве параметра объект Comment
        holder.bind(comments[position])
    }

    override fun getItemCount() = comments.size // * получаем размер списка comments
}