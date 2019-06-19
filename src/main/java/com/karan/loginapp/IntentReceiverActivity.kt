package com.karan.loginapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent_receiver.*

class IntentReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_receiver)
        val bundle = intent.extras
        val result1 = bundle.getString("Username")
        val result2 = bundle.getString("Password")
        userNameTextView.text = "Username:" + result1
        passwordTextView.text = "Password:" + result2
        Log.d("Username",result1)
        Log.d("Password",result2)
    }
}
