package com.e.aplikasidzikir.dzikiradapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.e.aplikasidzikir.R
import kotlinx.android.synthetic.main.cvw_pagi.view.*

class PagiAdapter(val context: Context, val listpagi: List<pagi>) :
        RecyclerView.Adapter<PagiAdapter.MyViewHolder>(){
    inner class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var currentpagi : pagi? =null

        fun setData (currpagi: pagi){
            itemView.juduldoa.text= currpagi!!.juduldoa
            itemView.isidoa.text= currpagi!!.isidoa
            itemView.artidoa.text= currpagi!!.artidoa

            this.currentpagi

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.cvw_pagi, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listpagi.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datapagi= listpagi[position]
        holder.setData(datapagi)// position)
    }

}
