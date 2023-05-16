package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SigninActivity : AppCompatActivity() {
    lateinit var txtsign:TextView
    lateinit var edtfname:EditText
    lateinit var edtsname:EditText
    lateinit var edtEmail:EditText
    lateinit var edtPass:EditText
    lateinit var btnsign:Button
    lateinit var txtaccount:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        txtsign=findViewById(R.id.textView3)
        edtfname=findViewById(R.id.editTextText7)
        edtsname=findViewById(R.id.editTextText9)
        edtEmail=findViewById(R.id.editTextTextEmailAddress3)
        edtPass=findViewById(R.id.editTextTextPassword2)
        btnsign=findViewById(R.id.button9)
        txtaccount=findViewById(R.id.textView4)


        txtaccount.setOnContextClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(Intent)
        }

    }
}