package com.karan.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton.setOnClickListener({
            val intent = Intent()
            intent.putExtra("Username",userNameEditText.text.toString())
            intent.putExtra("Password",passwordEditText.text.toString())
            intent.action = "testlogin"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            startActivity(intent)
        })
    }
}
