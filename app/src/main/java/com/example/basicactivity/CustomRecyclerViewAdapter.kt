package com.example.basicactivity

import android.content.Intent
import android.graphics.Color
import android.text.format.DateFormat
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.realm.RealmResults
import kotlinx.android.synthetic.main.one_result.view.*

class CustomRecyclerViewAdapter(realmResults: RealmResults<BloodPress>) :
RecyclerView.Adapter<ViewHolder>() {
    private val rResults: RealmResults<BloodPress> = realmResults

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder{
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.one_result, parent, false)
        val viewholder = ViewHolder(view)
        return viewholder
    }

    override fun getItemCount() :Int {
        return rResults.size
    }

    override fun onBindViewHolder(holder: ViewHolder, postion: Int) {
        val bloodPress = rResults[postion]
        holder.dataText?.text = DateFormat.format("yyy/MM/dd", bloodPress?.dateTime)
        holder.minMaxText?.text = "${bloodPress?.max.toString()}/${bloodPress?.min.toString()}"
        holder.pulseText?.text = bloodPress?.pulse.toString()
        holder.itemView.setBackgroundColor(if (postion % 2 == 0) Color.LTGRAY else Color.WHITE)
        holder.itemView.setOnClickListener{
            val intent = Intent(it.context,EditActivity::class.java)
            intent.putExtra("id",bloodPress?.id)
        }
    }
}