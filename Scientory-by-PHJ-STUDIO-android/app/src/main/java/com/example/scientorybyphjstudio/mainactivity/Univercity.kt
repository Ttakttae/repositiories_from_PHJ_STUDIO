package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.*
import kotlinx.android.synthetic.main.activity_univercity.*

class Univercity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_univercity)
        btn1.setOnClickListener {
            val intent = Intent(this, seoulunivercity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, yeonsaeunivercity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, koreaunivercity::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, sungkyunkwanunivercity::class.java)
            startActivity(intent)
        }
    }
}