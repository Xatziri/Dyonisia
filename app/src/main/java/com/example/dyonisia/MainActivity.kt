package com.example.dyonisia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.login_btn)
        loginButton.setOnClickListener{
            val Intent = Intent(this,StartQuiz::class.java)
            startActivity(Intent)
        }






    }
}
