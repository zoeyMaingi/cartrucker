package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    lateinit var edtphone:EditText
    lateinit var edtemail:EditText
    lateinit var edtpass:EditText
    lateinit var edt_account:EditText
    lateinit var btnlogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtphone=findViewById(R.id.editTextPhone)
        edtemail=findViewById(R.id.editTextTextEmailAddress)
        edtpass=findViewById(R.id.editTextTextPassword)
        edt_account=findViewById(R.id.editTextText6)
        btnlogin=findViewById(R.id.button8)

        edt_account.setOnContextClickListener {
            val intent=Intent(this,SigninActivity::class.java)
            startActivity(intent)
            }
        }
    }
}