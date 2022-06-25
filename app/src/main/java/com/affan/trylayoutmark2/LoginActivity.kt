package com.affan.trylayoutmark2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        getBackListener()
        btnLoginListener()
    }

    fun getBackListener(){
        iv_back1.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    fun btnLoginListener(){
        tv_login1.setOnClickListener{
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}