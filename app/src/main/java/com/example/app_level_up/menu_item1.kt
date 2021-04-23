package com.example.app_level_up

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_item1.*

class menu_item1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item1)
        button1.setOnClickListener{
            Intent(this,MainActivity::class.java).also { startActivity(

                it) }
        }
    }
}