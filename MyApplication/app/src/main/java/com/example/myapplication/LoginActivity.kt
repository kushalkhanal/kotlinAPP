package com.example.myapplication

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityLoginBinding
    lateinit var sharedPreferences: SharedPreferences
    var emailname: String? = null
    var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        var view = loginBinding.root
        setContentView(view)

        getData()

        loginBinding.loginId.setOnClickListener {
            sharedPreferences = getSharedPreferences("userdata", MODE_PRIVATE)
        }
        emailname = loginBinding.loginId.toString()
        password = loginBinding.passwordId.toString()

        var editor = sharedPreferences.edit()
        editor.putString("emailname", emailname)
        editor.putString("password", password)
        editor.apply()
        Toast.makeText(applicationContext, "Data saved", Toast.LENGTH_LONG).show()
        setContentView(view)

    }

     fun getData() {
        sharedPreferences = getSharedPreferences("userdata", MODE_PRIVATE)

        emailname = sharedPreferences.getString("username", "")
        password = sharedPreferences.getString("passwords", "")

        loginBinding.emailId.setText(emailname)
        loginBinding.passwordId.setText(password)

    }
}
