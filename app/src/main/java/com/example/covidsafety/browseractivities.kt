package com.example.covidsafety

import android.app.VoiceInteractor
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_browseractivities.*
import kotlinx.android.synthetic.main.activity_page2.*
import kotlinx.android.synthetic.main.activity_scanner.*

class browseractivities : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.activity_browseractivities)

        toggle= ActionBarDrawerToggle(this,drawerlayout,R.string.open,R.string.close)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.logoutaction ->{
                        FirebaseAuth.getInstance().signOut()
                        startActivity(Intent(this,MainActivity::class.java))
                        finish()
                    }
                R.id.scanner ->{ this.startActivity(Intent(this,Scanner::class.java)) }
            };true
        }

        //For entering into browsers and activities

        activecases.setOnClickListener {
            startActivity(Intent(this,Activecase_website::class.java)) }
        bed_avail.setOnClickListener {
            startActivity(Intent(this,beds_website::class.java)) }
        guidelines.setOnClickListener {
           startActivity(Intent(this,Guidelines_website::class.java))}
        mcq_page.setOnClickListener {
            startActivity(Intent(this,page3::class.java))
        }
        preventions.setOnClickListener{
            startActivity(Intent(this,slidingpages::class.java))
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}