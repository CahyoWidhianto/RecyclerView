package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSaluranTv : RecyclerView
    private val list = ArrayList<SaluranTv>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSaluranTv = findViewById(R.id.rv_saluran_tv)
        rvSaluranTv.setHasFixedSize(true)

        list.addAll(listSaluranTv)
        tampilkanRecycelerView()
    }

    private val listSaluranTv : ArrayList<SaluranTv>
        get(){
            val dataNama = resources.getStringArray(R.array.data_nama_tv)
            val dataDeskripsi = resources.getStringArray(R.array.data_deskripsi_tv)
            val dataLogo = resources.obtainTypedArray(R.array.data_logo_tv)
            val listTv = ArrayList<SaluranTv>()
                for (i in dataNama.indices){
                    val Tv = SaluranTv(
                        dataNama[i],
                        dataDeskripsi[i],
                        dataLogo.getResourceId(i,-1)
                    )
                    listTv.add(Tv)
                }
            return listTv
        }
    private fun tampilkanRecycelerView(){
        rvSaluranTv.layoutManager = LinearLayoutManager(this)
        val SaluranTvAdapter = SaluranTvAdapter(list)
        rvSaluranTv.adapter = SaluranTvAdapter
    }
}