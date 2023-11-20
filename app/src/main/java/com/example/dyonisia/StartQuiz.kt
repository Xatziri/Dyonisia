package com.example.dyonisia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_quiz)

        val startButton = findViewById<Button>(R.id.start_btnn)
        startButton.setOnClickListener {
            val Intent = Intent(this, Quiz::class.java)
            startActivity(Intent)
        }
    }

}