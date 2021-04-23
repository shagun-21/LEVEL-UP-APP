package com.example.app_level_up

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_menu_item1.*
import kotlinx.android.synthetic.main.activity_menu_item4.*

class menu_item4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item4)


        fun setupHyperlink(){
            val linkTextView = findViewById<TextView>(R.id.textView6)
            linkTextView.setMovementMethod(LinkMovementMethod.getInstance())
        }



        /*fun setupHyperlink(){
            val linktext = findViewById<TextView>(R.id.textView6)
    linktext.movementMethod=LinkMovementMethod.getInstance()

        }*/




        button4.setOnClickListener{
            Intent(this,MainActivity::class.java).also { startActivity(

                it) }
        }

    }




}