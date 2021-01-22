package com.e.aplikasidzikir.dzikiradapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.e.aplikasidzikir.R
import kotlinx.android.synthetic.main.cvw_sore.view.*

class SoreAdapter(val context: Context, val listsore: List<sore>) :
    RecyclerView.Adapter<SoreAdapter.MyViewHolder>(){
    inner class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var currentsore : sore? =null

        fun setData (currsore: sore){
            itemView.juduldoa.text= currsore!!.juduldoa
            itemView.isidoa.text= currsore!!.isidoa
            itemView.artidoa.text= currsore!!.artidoa

            this.currentsore

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.cvw_sore, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listsore.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datasore= listsore[position]
        holder.setData(datasore)// position)
    }

}
