package com.example.cricketadda

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val Player:ArrayList<ModelC>, private val context:Context): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        Log.d("enter","enter")
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val currentItem=Player[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.name.text=currentItem.Name

        holder.card.setOnClickListener{
            val intent=Intent(context,Detail::class.java)
            intent.putExtra("model",currentItem)
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
      return Player.size
    }
   inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val titleImage: ImageView =itemView.findViewById(R.id.titleImage)
        val name:TextView=itemView.findViewById(R.id.Name)
        val card:CardView=itemView.findViewById(R.id.card)

    }


}