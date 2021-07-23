package com.example.scientorybyphjstudio.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import com.example.scientorybyphjstudio.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent = Intent(this, Book::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Story::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Theory::class.java)
            startActivity(intent)
        }
    }
}