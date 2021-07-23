package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.*
import kotlinx.android.synthetic.main.activity_story.*

class Story : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
        button.setOnClickListener {
            val intent = Intent(this, RichardFeynman::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, TooFunScienceBook::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Flatland::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, funnyphysicstravel::class.java)
            startActivity(intent)
        }
    }
}