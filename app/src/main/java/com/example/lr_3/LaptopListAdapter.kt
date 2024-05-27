package com.example.lr_3
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class LaptopListAdapter(private val list: List<Laptop>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    class HeaderVH(view: View) : ViewHolder(view) {
        init {
            view.findViewById<Button>(R.id.button).setOnClickListener {
                (this.itemView.context as MainActivity).onClickCalled(
                    view.findViewById<TextView>(R.id.model_input_edit_text).text.toString()
                )
            }
        }
    }
    
    class ItemVH(view: View) : ViewHolder(view) {
        val model : TextView = view.findViewById(R.id.tv_model)
        val cpu : TextView = view.findViewById(R.id.tv_cpu)
        val ram : TextView = view.findViewById(R.id.tv_ram)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh = when(viewType){
            TYPE_ITEM -> ItemVH(LayoutInflater.from(parent.context).inflate(R.layout.laptop_item, parent, false))
            TYPE_HEADER -> HeaderVH(LayoutInflater.from(parent.context).inflate(R.layout.header_item, parent, false))
            else -> null
        }
        Log.d("test!", vh.toString())
        return vh!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        try {
            if (holder is ItemVH) {
                val vh: ItemVH = holder as ItemVH

                val elem = list[position - 1]
                vh.model.text = elem.model
                vh.ram.text = elem.ram
                vh.cpu.text = elem.cpu

            } else if (holder is HeaderVH) {
                val vh: HeaderVH = holder as HeaderVH
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getItemCount(): Int {
        return list.size + 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            TYPE_HEADER
        } else TYPE_ITEM
    }

    companion object {
        private const val TYPE_ITEM = 0
        private const val TYPE_HEADER = 1
    }
}
