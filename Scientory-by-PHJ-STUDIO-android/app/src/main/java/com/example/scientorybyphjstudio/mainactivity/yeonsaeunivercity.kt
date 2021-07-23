package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.R
import com.example.scientorybyphjstudio.yeonsaeunivercity.*
import kotlinx.android.synthetic.main.activity_yeonsaeunivercity.*

class yeonsaeunivercity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yeonsaeunivercity)
        btn1.setOnClickListener {
            val intent = Intent(this, yeonsaeunivercity2020::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, yeonsaeunivercity2019::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, yeonsaeunivercity2018::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, yeonsaeunivercity2017::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, yeonsaeunivercity2016::class.java)
            startActivity(intent)
        }
    }
}