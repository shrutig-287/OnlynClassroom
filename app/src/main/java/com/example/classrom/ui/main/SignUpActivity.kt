package com.example.classrom.ui.main


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.classrom.MainActivity
import com.example.classrom.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        btnAccount.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}