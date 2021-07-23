package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.scientorybyphjstudio.R
import com.example.scientorybyphjstudio.seoulunivercity.*
import kotlinx.android.synthetic.main.activity_seoulunivercity.*

class seoulunivercity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seoulunivercity)
        btn1.setOnClickListener {
            val intent = Intent(this, seoulunivercity2020::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, seoulunivercity2019::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, seoulunivercity2018::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, seoulunivercity2017::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, seoulunivercity2016::class.java)
            startActivity(intent)
        }
    }
}