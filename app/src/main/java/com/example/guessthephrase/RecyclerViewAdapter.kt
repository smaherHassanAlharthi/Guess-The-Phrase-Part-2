package com.example.guessthephrase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.* //to invoke tvItem

class RecyclerViewAdapter (private val guesses: ArrayList<String>): RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false //because we dont want to attach it to the Root
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val task = guesses[position] //to access different colors

        holder.itemView.apply {
            tvItem.text=task
        }
    }

    override fun getItemCount(): Int {
        return guesses.size
    }

}