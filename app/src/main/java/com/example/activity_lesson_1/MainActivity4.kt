package com.example.activity_lesson_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
    fun onClickGoMain3(view : View) {
        val intent = Intent( this, MainActivity::class.java)
        startActivity(intent)
    }
}