package com.example.listwisata

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class WisataAdapter(private val listWisata: ArrayList<WisataModel>) :
    RecyclerView.Adapter<WisataAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_wisata, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.img)
            .apply(RequestOptions().override(55, 55))
            .into((holder.tvImg))

        holder.tvNama.text = wisata.nama
        holder.tvDetail.text = wisata.detail

        val moveDetail = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveToDetail = Intent(moveDetail, DetailActivity::class.java)

            moveToDetail.putExtra(DetailActivity.NAMA, wisata.nama)
            moveToDetail.putExtra(DetailActivity.LOCATION, wisata.location)
            moveToDetail.putExtra(DetailActivity.DETAIL, wisata.detail)
            moveDetail.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.item_title)
        var tvDetail: TextView = itemView.findViewById(R.id.item_desc)
        var tvImg: ImageView = itemView.findViewById(R.id.item_img)

    }
}