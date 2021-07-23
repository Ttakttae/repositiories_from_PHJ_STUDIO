package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.R
import com.example.scientorybyphjstudio.yeongpung.*
import kotlinx.android.synthetic.main.activity_yeongpung.*

class yeongpung : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yeongpung)
        btn1.setOnClickListener {
            val intent = Intent(this, yeongpung2020::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, yeongpung2019::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, yeongpung2018::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, yeongpung2017::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, yeongpung2016::class.java)
            startActivity(intent)
        }
    }
}