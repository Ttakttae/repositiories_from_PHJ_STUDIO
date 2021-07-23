package com.example.scientorybyphjstudio.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.scientorybyphjstudio.*
import kotlinx.android.synthetic.main.activity_book.*

class Book : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        button.setOnClickListener {
            val intent = Intent(this, Univercity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Bookstore::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, kofac::class.java)
            startActivity(intent)
        }
    }
}