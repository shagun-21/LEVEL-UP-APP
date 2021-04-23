package com.example.app_level_up

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.app_level_up.R.id.item1
import com.ms.square.android.expandabletextview.ExpandableTextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu_item2.*

class MainActivity : AppCompatActivity() {



     var images = intArrayOf(R.drawable.carouselimageek,R.drawable.carouselimagedo,R.drawable.carouselimageteen,R.drawable.carouselimagechaar)



    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btn_registor.setOnClickListener{
            Intent(this,registor::class.java).also { startActivity(

                it) }
        }


        val expTv: ExpandableTextView = findViewById(R.id.expand_text_view)
        expTv.setText("An amazing platform for passionate gamers.We've created an atmosphere for game lovers, be it real games or virtual.We aim at providing one of the best" +
                "and rare thing out there,FUN.On our platform you can hone your gaming skills and abilities.We aim at providing the best platform for gamers" +
                "to connect and socialize & play like a champion. We organise regular tournaments and events with impressive prizes.We also organise weekly contests" +
                "for gaming lovers.Our aim is to bring gaming enthusiasts up.Any one can join our community and get your gaming journey started right away.")


        toggle= ActionBarDrawerToggle(this, drawerLayout ,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        /*supportActionBar?.setDisplayUseLogoEnabled(true)
        actionBar?.setLogo(R.drawable.level__up__logo)*/


        cs.pageCount=images.size

        cs.setImageListener { position, imageView ->
            imageView.setImageResource(images[position])
        }

    nav_view.setNavigationItemSelectedListener{ menuItem ->
        when(menuItem.itemId){
            R.id.item1 -> {
                val intent = Intent(this,menu_item1::class.java)
                startActivity(intent)
                true
            }

            R.id.item2 -> {
                val intent=Intent(this,menu_item2::class.java)
                startActivity(intent)
                true
            }

            R.id.item3 -> {
                val intent = Intent(this,menu_item3::class.java)
                startActivity(intent)
                true
            }

            R.id.item4 -> {
                val intent = Intent(this,menu_item4::class.java)
                startActivity(intent)
                true
            }
            R.id.item5 -> {
                val intent = Intent(this,menu_item5::class.java)
                startActivity(intent)
                true
            }
            else -> false


        }
    }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)

    }



            }



