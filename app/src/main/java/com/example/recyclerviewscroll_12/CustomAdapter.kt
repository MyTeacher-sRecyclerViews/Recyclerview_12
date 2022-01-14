package com.example.recyclerviewscroll_12

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(context: Context, val members: ArrayList<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]

        if (holder is CustomViewHolder) {
            holder.firstName.text = member.firstName
            holder.lastName.text = member.lastName
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val firstName: TextView = view.findViewById(R.id.firstName)
        val lastName: TextView = view.findViewById(R.id.lastName)
    }
}