package com.kemalakkus.demirtasdesignproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kemalakkus.demirtasdesignproject.R
import com.kemalakkus.demirtasdesignproject.databinding.SearchItemBinding

class SearchAdapter() : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    class ViewHolder(val binding: SearchItemBinding) : RecyclerView.ViewHolder(binding.root)

    val photoList = listOf(
        R.drawable.moda1,
        R.drawable.moda2,
        R.drawable.moda1
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.imageView.setImageResource(photoList[position % photoList.size])

    }

    override fun getItemCount(): Int {
        return 30
    }
}