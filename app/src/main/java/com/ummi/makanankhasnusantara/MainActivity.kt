package com.ummi.makanankhasnusantara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<KhasNusantara>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_main.setHasFixedSize(true)
        list.addAll(getDataFood())
        showRecyclerlist()

    }

    private fun showRecyclerlist() {
        rv_main.layoutManager = LinearLayoutManager(this)
        val listKhasNusantara = ListKhasNusantara(list)
        rv_main.adapter = listKhasNusantara

    }

    private fun getDataFood(): ArrayList<KhasNusantara> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listFood = ArrayList<KhasNusantara>()
        for (position in dataName.indices) {
            val khasNusantara = KhasNusantara(
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listFood.add(khasNusantara)

        }
        return listFood

    }
}

