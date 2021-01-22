package com.e.aplikasidzikir.dzikiradapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.e.aplikasidzikir.R
import kotlinx.android.synthetic.main.cvw_pagi.view.*
import kotlinx.android.synthetic.main.cvw_pray.view.*
import kotlinx.android.synthetic.main.cvw_sore.view.*

class PrayAdapter(val context: Context, val listpray: List<pray>) :
    RecyclerView.Adapter<PrayAdapter.MyViewHolder>(){
    inner class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var currentpray : pray? =null

        fun setData (currpray: pray){
            itemView.doa.text= currpray!!.doa
            itemView.arti.text= currpray!!.arti


            this.currentpray

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.cvw_pray, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listpray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datapray= listpray[position]
        holder.setData(datapray)// position)
    }

}
