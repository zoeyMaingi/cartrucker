package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textViewcar: TextView
    lateinit var buttonlogin: Button
    lateinit var buttonsignin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewcar=findViewById(R.id.editTextText3)
        buttonlogin=findViewById(R.id.BTN_LOGIN)
        buttonsignin=findViewById(R.id.button3)

        textViewcar.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        buttonlogin.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        buttonsignin.setOnClickListener {
            val intent=Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
    }
}