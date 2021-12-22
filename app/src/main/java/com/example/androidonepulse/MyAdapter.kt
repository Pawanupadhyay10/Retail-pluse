package com.example.androidonepulse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList : ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,
            parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.address.text = currentitem.address
        holder.area.text = currentitem.area
        holder.names.text = currentitem.name
        holder.route.text = currentitem.route
        holder.type.text = currentitem.type

    }

    override fun getItemCount(): Int {

        return userList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val address : TextView = itemView.findViewById(R.id.tvfirstName)
        val area : TextView = itemView.findViewById(R.id.tvlastName)
        val names : TextView = itemView.findViewById(R.id.tvage)
        val route : TextView = itemView.findViewById(R.id.route)
        val type : TextView = itemView.findViewById(R.id.type)

    }

}