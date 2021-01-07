package com.example.covidsafety

import android.media.Image
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

class scrollpageradapter(private var images:List<Int>) : RecyclerView.Adapter<scrollpageradapter.Pager2ViewHolder>(){
    inner class Pager2ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){

        val itemImage:ImageView=itemView.findViewById(R.id.ivimage)

    }

    override fun onCreateViewHolder
                (parent: ViewGroup, viewType: Int): scrollpageradapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.scroll_pages,parent,false))
    }

    override fun getItemCount(): Int {
      return images.size
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
    }

}