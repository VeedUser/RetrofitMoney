package com.example.retrofitmoney.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmoney.R
import com.example.retrofitmoney.model.cashless.CashlessItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond = emptyList<CashlessItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {

        holder.itemView.itemName.text = listSecond[position].ccy
        holder.itemView.itemBuy.text = listSecond[position].buy
        holder.itemView.itemSale.text = listSecond[position].sale

    }

    override fun getItemCount(): Int {
        return listSecond.size

    }


    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<CashlessItem>){
        listSecond = list
        notifyDataSetChanged()
    }
}
