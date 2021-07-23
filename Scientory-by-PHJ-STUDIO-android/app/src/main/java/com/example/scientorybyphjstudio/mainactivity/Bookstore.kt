package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.res.Configuration
import android.widget.TextView
import android.graphics.Color
import com.example.scientorybyphjstudio.*
import kotlinx.android.synthetic.main.activity_bookstore.*


class Bookstore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val currentNightMode = Configuration.UI_MODE_NIGHT_MASK
        when (currentNightMode) {
            Configuration.UI_MODE_NIGHT_NO -> {} // Night mode is not active, we're using the light theme
            Configuration.UI_MODE_NIGHT_YES -> {ad2.setTextColor(Color.parseColor("#000000"))} // Night mode is active, we're using dark theme
        }
        setContentView(R.layout.activity_bookstore)
        btn5.setOnClickListener {
            val intent = Intent(this, yes24::class.java)
            startActivity(intent)
        }
        btn6.setOnClickListener {
            val intent = Intent(this, kyobo::class.java)
            startActivity(intent)
        }
        btn7.setOnClickListener {
            val intent = Intent(this, yeongpung::class.java)
            startActivity(intent)
        }
        btn8.setOnClickListener {
            val intent = Intent(this, aladin::class.java)
            startActivity(intent)
        }
        btn9.setOnClickListener {
            val intent = Intent(this, interpark::class.java)
            startActivity(intent)
        }
    }

}