package ru.homework.mytrialapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.homework.mytrialapp.R
import ru.homework.mytrialapp.model.MyCard

class RawMaterialsAdapter(
    var items : List<MyCard>
) : RecyclerView.Adapter<RawMaterialsAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardHeader : TextView = itemView.findViewById(R.id.tvCardHeader)
        val draft : ImageView = itemView.findViewById(R.id.ivDraft)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_card, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.cardHeader.text = items[position].title
        holder.draft.setImageResource(items[position].image)
    }

    override fun getItemCount(): Int = items.size
}