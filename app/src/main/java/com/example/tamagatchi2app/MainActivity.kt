package com.example.tamagatchi2app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var stbutton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stbutton = findViewById(R.id.Startbutton)

        stbutton.setOnClickListener {
            val intent1 = Intent(this, SecActivity::class.java)
            startActivity(intent1)

        }


    }
}