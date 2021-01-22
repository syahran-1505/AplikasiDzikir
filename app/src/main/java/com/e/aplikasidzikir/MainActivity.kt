package com.e.aplikasidzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_detail_pagi.*
import kotlinx.android.synthetic.main.activity_detail_pray.*
import kotlinx.android.synthetic.main.activity_detail_sore.*
import kotlinx.android.synthetic.main.activity_detail_keutamaan.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnpindahpagi:ImageView = findViewById(R.id.btn_pagi)
        btnpindahpagi.setOnClickListener(this)

        val btnpindahsore:ImageView = findViewById(R.id.btn_sore)
        btnpindahsore.setOnClickListener(this)

        val btnpindahpray:ImageView = findViewById(R.id.btn_pray)
        btnpindahpray.setOnClickListener(this)

        val btnpindahkeutamaan:ImageView= findViewById(R.id.btn_keutamaan)
        btnpindahkeutamaan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_pagi -> {
                val move_to_pagi = Intent(this@MainActivity, DetailPagiActivity::class.java)
                startActivity(move_to_pagi)
            }

            R.id.btn_sore -> {
                val move_to_sore = Intent(this@MainActivity, DetailSoreActivity::class.java)
                startActivity(move_to_sore)
            }
            R.id.btn_pray -> {
                val move_to_pray = Intent(this@MainActivity, DetailPrayActivity::class.java)
                startActivity(move_to_pray)
            }
            R.id.btn_keutamaan -> {
                val move_to_keutamaan = Intent(this@MainActivity, DetailKeutamaanActivity::class.java)
                startActivity(move_to_keutamaan)

            }
        }
    }
/*          val layManager = LinearLayoutManager(this)
       layManager.orientation = LinearLayoutManager.VERTICAL
       daftar_dzikir_pagi.layoutManager = layManager
       adapterPagi = DuaAdapterPagi(this,DuaModel.newslistpagi)
       daftar_dzikir_pagi.adapter = adapterPagi
       adapterPagi.setOnClickCallBack(object : DuaAdapterPagi.onItemClickCallBack {
           override fun onItemClick(data: DuaPagi) {
               val intent = Intent(this@MainActivity,DzikirPagi::class.java)
                   .apply {
                       putExtra()
                   }
           }
       })*/

}
