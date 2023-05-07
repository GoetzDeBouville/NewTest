package com.example.newtest

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val userNumberView: TextView = itemView.findViewById(R.id.userNumber)
    private val commentTextView: TextView = itemView.findViewById(R.id.commentText)

    fun bind(model: Comment) { // метод склеивания объектов комментариев
        userNumberView.text = "#${model.userNumber}"
        commentTextView.text = model.commentText
    }
}