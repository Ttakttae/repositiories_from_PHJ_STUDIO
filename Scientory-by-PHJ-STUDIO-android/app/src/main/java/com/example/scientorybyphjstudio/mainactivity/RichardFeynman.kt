package com.example.scientorybyphjstudio.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_richard_feynman.*
import android.content.Intent
import com.example.scientorybyphjstudio.R
import com.example.scientorybyphjstudio.feynmsn.*

class RichardFeynman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_richard_feynman)
        chapter1.setOnClickListener {
            val intent = Intent(this, feynmanchapter1::class.java)
            startActivity(intent)
        }
        chapter2.setOnClickListener {
            val intent = Intent(this, feynmanchapter2::class.java)
            startActivity(intent)
        }
        chapter3.setOnClickListener {
            val intent = Intent(this, feynmanchapter3::class.java)
            startActivity(intent)
        }
        chapter4.setOnClickListener {
            val intent = Intent(this, feynmanchapter4::class.java)
            startActivity(intent)
        }
        chapter5.setOnClickListener {
            val intent = Intent(this, feynmanchapter5::class.java)
            startActivity(intent)
        }
        chapter6.setOnClickListener {
            val intent = Intent(this, feynmanchapter6::class.java)
            startActivity(intent)
        }
        keyword.setOnClickListener {
            val intent = Intent(this, feynmanchapterkeyword::class.java)
            startActivity(intent)
        }
    }
}
