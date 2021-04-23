package com.example.app_level_up

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_item2.*
import kotlinx.android.synthetic.main.activity_registor.*

class registor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registor)
        button_proceed.setOnClickListener{
            Intent(this,MainActivity::class.java).also { startActivity(

                it) }
        }
    }
}