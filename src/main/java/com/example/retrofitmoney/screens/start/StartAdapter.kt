package com.example.retrofitmoney.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmoney.R
import com.example.retrofitmoney.model.cash.CashItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<CashItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {

        holder.itemView.itemName.text = listStart[position].ccy
        holder.itemView.itemBuy.text = listStart[position].buy
        holder.itemView.itemSale.text = listStart[position].sale

    }

    override fun getItemCount(): Int {
        return listStart.size

    }


    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<CashItem>){
        listStart = list
        notifyDataSetChanged()
    }
}