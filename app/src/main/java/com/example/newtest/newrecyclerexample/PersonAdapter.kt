package com.example.newtest.newrecyclerexample

import android.annotation.SuppressLint
import android.graphics.Color.red
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newtest.R
import com.example.newtest.databinding.ItemPersonNewExampleBinding


class PersonAdapter : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPersonNewExampleBinding.inflate(inflater, parent, false)

        return PersonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = data[position] // Получение человека из списка данных по позиции
        val context = holder.itemView.context

        with(holder.binding) {
            val color =
                if (person.isLiked) R.color.gradient_end else R.color.color10

            nameTextView.text = person.name // Отрисовка имени пользователя
            companyTextView.text = person.companyName // Отрисовка компании пользователя
            likedImageView.setColorFilter( // Отрисовка цвета "сердца"
                ContextCompat.getColor(context, color),
                android.graphics.PorterDuff.Mode.SRC_IN
            )
            Glide.with(context).load(person.photo)
                .circleCrop() // Отрисовка фотографии пользователя с помощью библиотеки Glide
                .error(R.drawable.hamster)
                .placeholder(R.drawable.hamster).into(imageView)
        }
    }

    override fun getItemCount(): Int = data.size

    var data: List<Person> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    class PersonViewHolder(val binding: ItemPersonNewExampleBinding) :
        RecyclerView.ViewHolder(binding.root)

}