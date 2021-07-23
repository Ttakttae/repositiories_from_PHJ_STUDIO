package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.*
import com.example.scientorybyphjstudio.koreaunivercity.*
import kotlinx.android.synthetic.main.activity_koreaunivercity.*

class koreaunivercity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koreaunivercity)
        btn1.setOnClickListener {
            val intent = Intent(this, koreaunivercity2020::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, koreaunivercity2019::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, koreaunivercity2018::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, koreaunivercity2017::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, koreaunivercity2016::class.java)
            startActivity(intent)
        }
    }
}