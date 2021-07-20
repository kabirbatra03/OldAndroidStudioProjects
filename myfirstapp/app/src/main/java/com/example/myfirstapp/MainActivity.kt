package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     val textView = findViewById<TextView>(R.id.text_view_id) as TextView
        textView?.setOnClickListener{ Toast.makeText(this@MainActivity,
        R.string.test_on_click, Toast.LENGTH_LONG).show()}

    }
}