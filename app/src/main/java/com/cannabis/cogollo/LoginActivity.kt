package com.cannabis.cogollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    var register_btn: Button? = null
    var login_btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(3000)
        setTheme(R.style.splashTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        register_btn = findViewById<Button>(R.id.registro_btn)
        login_btn = findViewById<Button>(R.id.ingresar_btn)

        register_btn!!.setOnClickListener {
            val intent= Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }


        login_btn!!.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



    }
}