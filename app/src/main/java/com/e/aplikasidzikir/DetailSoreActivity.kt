package com.e.aplikasidzikir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.aplikasidzikir.dzikiradapter.ModelPagi
import com.e.aplikasidzikir.dzikiradapter.ModelSore
import com.e.aplikasidzikir.dzikiradapter.PagiAdapter
import com.e.aplikasidzikir.dzikiradapter.SoreAdapter
import kotlinx.android.synthetic.main.activity_detail_pagi.*
import kotlinx.android.synthetic.main.activity_detail_sore.*

class DetailSoreActivity : AppCompatActivity() {

    private lateinit var SoreAdapter: SoreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sore)

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_dzikirsore.layoutManager = layManager

        SoreAdapter = SoreAdapter(this, ModelSore.newlists)
        rcv_dzikirsore.adapter = SoreAdapter

    }

}