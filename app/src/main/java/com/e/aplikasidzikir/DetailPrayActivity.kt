package com.e.aplikasidzikir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.aplikasidzikir.dzikiradapter.ModelPagi
import com.e.aplikasidzikir.dzikiradapter.ModelPray
import com.e.aplikasidzikir.dzikiradapter.PagiAdapter
import com.e.aplikasidzikir.dzikiradapter.PrayAdapter
import kotlinx.android.synthetic.main.activity_detail_pagi.*
import kotlinx.android.synthetic.main.activity_detail_pray.*

class DetailPrayActivity : AppCompatActivity() {

    private lateinit var PrayAdapter: PrayAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pray)

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_pray.layoutManager = layManager

        PrayAdapter = PrayAdapter(this, ModelPray.newlists)
        rcv_pray.adapter = PrayAdapter

    }

}
