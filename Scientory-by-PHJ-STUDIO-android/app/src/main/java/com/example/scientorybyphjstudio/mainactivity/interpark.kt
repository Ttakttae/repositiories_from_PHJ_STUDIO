package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.*
import com.example.scientorybyphjstudio.interpark.*
import kotlinx.android.synthetic.main.activity_interpark.*

class interpark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interpark)
        btn1.setOnClickListener {
            val intent = Intent(this, interpark2020::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, interpark2019::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, interpark2018::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, interpark2017::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, interpark2016::class.java)
            startActivity(intent)
        }
    }
}