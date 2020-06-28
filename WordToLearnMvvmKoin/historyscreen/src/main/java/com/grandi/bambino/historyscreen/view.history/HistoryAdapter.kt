package com.grandi.bambino.historyscreen.view.history

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.grandi.bambino.historyscreen.R
import com.grandi.bambino.model.model.data.SearchResult
import kotlinx.android.synthetic.main.activity_history_recyclerview_item.view.*

class HistoryAdapter(private var data : List<SearchResult>) : RecyclerView.Adapter<HistoryAdapter.RecyclerItemViewHolder>() {

    fun setData(data: List<SearchResult>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerItemViewHolder {
        return RecyclerItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_history_recyclerview_item, parent, false) as View
        )
    }

    override fun onBindViewHolder(holder: RecyclerItemViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class RecyclerItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(data: SearchResult) {
            if (layoutPosition != RecyclerView.NO_POSITION) {
                itemView.header_history_textview_recycler_item.text = data.word
                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, "on click: ${data.word}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
