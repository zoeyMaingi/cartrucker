package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var edtviewcar:EditText
    lateinit var buttonlogin: Button
    lateinit var buttonsignin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtviewcar=findViewById(R.id.editTextText3)
        buttonlogin=findViewById(R.id.button4)
        buttonsignin=findViewById(R.id.btn_button6)

        edtviewcar.setOnClickListener {
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