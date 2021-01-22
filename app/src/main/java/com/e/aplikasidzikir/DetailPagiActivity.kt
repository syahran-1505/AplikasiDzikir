package com.e.aplikasidzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.aplikasidzikir.dzikiradapter.ModelPagi
import com.e.aplikasidzikir.dzikiradapter.PagiAdapter
import com.e.aplikasidzikir.dzikiradapter.pagi
import kotlinx.android.synthetic.main.activity_detail_pagi.*

class DetailPagiActivity : AppCompatActivity() {

    private lateinit var PagiAdapter : PagiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pagi)

        val layManager= LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_dzkiripagi.layoutManager= layManager

        PagiAdapter= PagiAdapter(this, ModelPagi.newlists)
        rcv_dzkiripagi.adapter = PagiAdapter



    }
}