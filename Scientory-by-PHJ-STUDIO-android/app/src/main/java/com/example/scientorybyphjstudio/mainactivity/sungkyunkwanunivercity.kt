package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.R
import com.example.scientorybyphjstudio.koreaunivercity.*
import com.example.scientorybyphjstudio.sungkyunkwanunivercity.*
import kotlinx.android.synthetic.main.activity_sungkyunkwanunivercity.*

class sungkyunkwanunivercity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sungkyunkwanunivercity)
        btn1.setOnClickListener {
            val intent = Intent(this, sungkyunkwanunivercity2020::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, sungkyunkwanunivercity2019::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, sungkyunkwanunivercity2018::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, sungkyunkwanunivercity2017::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, sungkyunkwanunivercity2016::class.java)
            startActivity(intent)
        }
    }
}