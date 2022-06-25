package com.affan.trylayoutmark2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLoginListener()
        btnRegisterListener()
    }

    fun btnLoginListener(){
        btn_login1.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }

    fun btnRegisterListener(){
        btn_register1.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}