package com.example.app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.models.DesignModel

class DesignAdapter (private val designList: ArrayList<DesignModel>):
    RecyclerView.Adapter<DesignAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.design_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentDesign = designList[position]
        holder.tvDesignName.text = currentDesign.designName
    }

    override fun getItemCount(): Int {
        return designList.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvDesignName : TextView = itemView.findViewById(R.id.tvDesignName)


        }

    }



