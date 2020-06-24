package com.grandi.bambino.wordtolearn.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grandi.bambino.wordtolearn.R
import com.grandi.bambino.model.model.data.SearchResult
import kotlinx.android.synthetic.main.item_words.view.*

class MainAdapter(private var data: List<com.grandi.bambino.model.model.data.SearchResult>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    fun getData(data: List<com.grandi.bambino.model.model.data.SearchResult>){
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_words, parent, false) as View
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(data: SearchResult){
            if (layoutPosition !=RecyclerView.NO_POSITION){
                itemView.words_text_view.text = data.word
                itemView.translate_text_view.text = data.meanings?.get(0)?.translation?.translation
                itemView.transcriptions_text_view.text = data.meanings?.get(0)?.transcription
            }


        }

    }

}

