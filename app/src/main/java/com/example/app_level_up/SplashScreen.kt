package com.example.app_level_up

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.timer

class SplashScreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val time:Long= 2000
        Handler().postDelayed(Runnable {
            val intent = Intent(SplashScreen@this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },time)

    }
}