package com.sadeesha.platform.classroomappui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginScreen : AppCompatActivity(), View.OnClickListener {
    var signIn: Button? = null
    var signUp: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        signIn = findViewById(R.id.sign_in)
        signUp = findViewById(R.id.sign_up)
        signIn.setOnClickListener(this)
        signUp.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.sign_in) {
            val intent = Intent(applicationContext, Home::class.java)
            startActivity(intent)
        } else if (view.id == R.id.sign_up) {
            val intent = Intent(applicationContext, SignupScreen::class.java)
            startActivity(intent)
        }
    }
}
