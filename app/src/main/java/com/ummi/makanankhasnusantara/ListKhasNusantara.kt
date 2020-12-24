package com.ummi.makanankhasnusantara

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_makanan.view.*

class ListKhasNusantara(private val listKhas: ArrayList<KhasNusantara>) :
    RecyclerView.Adapter<ListKhasNusantara.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(khasNusantara: KhasNusantara) {
            with(itemView) {
                //get and set a picture
                Glide.with(itemView.context).load(khasNusantara.photo)
                    .apply(RequestOptions().override(60, 60)).into(iv_list_khas)
                // get a set data name and description
                tv_name_list.text = khasNusantara.name
                tv_description_list.text = khasNusantara.description

            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListKhasNusantara.ListViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_makanan, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listKhas.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
    holder.bind(listKhas[position])
    }

}