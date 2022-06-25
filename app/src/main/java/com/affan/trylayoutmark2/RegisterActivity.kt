package com.affan.trylayoutmark2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        getBackListener()
        btnRegisterListener()
    }

    fun getBackListener(){
        iv_back2.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    fun btnRegisterListener(){
        tv_register1.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}