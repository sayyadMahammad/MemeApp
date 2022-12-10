package com.example.mymemesapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mymemesapp.R
import com.example.mymemesapp.data.Meme
import javax.inject.Inject

class MemesAdapter @Inject constructor(kFunction0: () -> Unit) : RecyclerView.Adapter<MemesAdapter.MemeHolder>() {
    class MemeHolder(val view: View):RecyclerView.ViewHolder(view){
        var image = itemView.findViewById<ImageView>(R.id.imageView)
        var Text = itemView.findViewById<TextView>(R.id.textView)
    }
   private var mlist = mutableListOf<Meme>()
   private val memesLst : List<Meme>
      get()=mlist
    fun getList(list : List<Meme> ){
        mlist.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_meme ,parent, false)
        return MemeHolder(view)
    }

    override fun onBindViewHolder(holder: MemeHolder, position: Int) {
        holder.Text.text = memesLst[position].name
       Glide.with(holder.itemView).load(memesLst[position].url).into(holder.image)
    }

    override fun getItemCount(): Int = memesLst.size

}