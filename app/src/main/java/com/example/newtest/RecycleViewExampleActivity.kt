package com.example.newtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleViewExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comment_view)
    }
}

data class Comment(val userNumber: Int, val commentText: String)

class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val userNumberView: TextView = itemView.findViewById(R.id.userNumber)
    private val commentTextView: TextView = itemView.findViewById(R.id.commentText)

    fun bind(model: Comment) {
        userNumberView.text = "#${model.userNumber}"
        commentTextView.text = model.commentText
    }
}

class CommentAdapter(
    private val comments: List<Comment>
) : RecyclerView.Adapter<CommentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comment_view, parent, false) //comment_view это непосредственное файл layout comment_view.xml
        return CommentViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        holder.bind(comments[position])
    }

    override fun getItemCount() = comments.size
}
