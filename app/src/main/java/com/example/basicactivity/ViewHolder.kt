package com.example.basicactivity


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.one_result.view.*

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var dataText : TextView? = null
    var minMaxText :TextView? = null
    var pulseText :TextView? = null
    init {
        // ビューホルダーのプロパティとレイアウトのViewの対応
        dataText = itemView.dataText
        minMaxText = itemView.minMaxText
        pulseText = itemView.pulseText
    }
}