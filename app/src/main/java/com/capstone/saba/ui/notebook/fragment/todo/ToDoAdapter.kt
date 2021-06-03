package com.capstone.saba.ui.notebook.fragment.todo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.capstone.saba.databinding.ListTodoBinding
import com.capstone.saba.domain.model.Todo
import java.util.ArrayList

class ToDoAdapter (private val listTodo: ArrayList<Todo>) : RecyclerView.Adapter<ToDoAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTodo[position])
    }

    override fun getItemCount(): Int = listTodo.size

    class ViewHolder(private val binding: ListTodoBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(todo: Todo){
            with(binding){
                tvDesTodo.text = todo.deskripsi.toString()
            }
        }

    }
}