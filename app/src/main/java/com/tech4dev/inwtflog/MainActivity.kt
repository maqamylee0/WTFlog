package com.tech4dev.inwtflog

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var phoneNumber : EditText
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        phoneNumber = findViewById(R.id.phone)
//        button = findViewById(R.id.imageButton2)
    }
}