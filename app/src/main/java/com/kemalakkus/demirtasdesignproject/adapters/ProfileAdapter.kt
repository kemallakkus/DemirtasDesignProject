package com.kemalakkus.demirtasdesignproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kemalakkus.demirtasdesignproject.R
import com.kemalakkus.demirtasdesignproject.databinding.ProfileItemBinding
import com.kemalakkus.demirtasdesignproject.databinding.SearchItemBinding

class ProfileAdapter() : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

    class ViewHolder(val binding: ProfileItemBinding) : RecyclerView.ViewHolder(binding.root)

    val photoList = listOf(
        R.drawable.moda1,
        R.drawable.moda2,
        R.drawable.moda1,
        R.drawable.moda2
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ProfileItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.imgProfile.setImageResource(photoList[position % photoList.size])

    }

    override fun getItemCount(): Int {
        return 4
    }
}