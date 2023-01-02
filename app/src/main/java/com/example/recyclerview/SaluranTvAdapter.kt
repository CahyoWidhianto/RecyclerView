package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SaluranTvAdapter(
    private val listTv : ArrayList<SaluranTv>
) : RecyclerView.Adapter<TvViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        val itemView : View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_saluran_tv,
                parent,
                false
            )
        return TvViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        holder.bind(listTv[position])
    }

    override fun getItemCount(): Int {
        return listTv.size
    }

}


class TvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvNamaTeam: TextView = itemView.findViewById(R.id.tv_nama_tv)
    var tvDeskripsiTeam: TextView = itemView.findViewById(R.id.tv_deskripsi_tv)
    var ivLogoTeam: ImageView = itemView.findViewById(R.id.iv_logo_tv)
    fun bind(team : SaluranTv){
        tvNamaTeam.text = team.nama
        tvDeskripsiTeam.text =team.deskripsi
        ivLogoTeam.setImageResource(team.logo)
    }
}