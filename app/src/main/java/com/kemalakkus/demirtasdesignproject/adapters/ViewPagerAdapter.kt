package com.kemalakkus.demirtasdesignproject.adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.kemalakkus.demirtasdesignproject.R
import com.kemalakkus.demirtasdesignproject.databinding.HomeItemBinding

class ViewPagerAdapter: RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(val binding: HomeItemBinding): ViewHolder(binding.root)

    val photoList = arrayListOf<Int>(R.drawable.moda1,R.drawable.moda2,R.drawable.moda1,R.drawable.moda2)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        return ViewPagerViewHolder(HomeItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.binding.imgHome.setImageResource(photoList[position])



    }

    override fun getItemCount(): Int {
        return 4
    }


}