package com.kotlintutorial.app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kotlintutorial.app.databinding.LessonTitleBinding
import com.kotlintutorial.app.model.Lesson

class LessonTitleAdapter : ListAdapter<Lesson, LessonTitleAdapter.MyViewHolder>(diffCallBack) {
    private var listener: OnItemClickedListener? = null

    class MyViewHolder(val binding: LessonTitleBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LessonTitleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.lessonTitle.text=HtmlCompat.fromHtml(item.title,HtmlCompat.FROM_HTML_MODE_LEGACY)
        holder.itemView.setOnClickListener {
            listener?.onItemClicked(item)
        }
    }

    companion object {
        val diffCallBack = object : DiffUtil.ItemCallback<Lesson>() {
            override fun areItemsTheSame(oldItem: Lesson, newItem: Lesson): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Lesson, newItem: Lesson): Boolean {
                return oldItem == newItem
            }
        }
    }

    interface OnItemClickedListener {
        fun onItemClicked(lesson: Lesson)
    }

    fun setOnItemClickedListener(onItemClickedListener: OnItemClickedListener) {
        this.listener = onItemClickedListener
    }
}