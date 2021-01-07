package com.example.covidsafety

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class flash_screen : AppCompatActivity() {
    lateinit var firebaseAuth: FirebaseAuth
    private val spalsh : Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen)
        firebaseAuth = FirebaseAuth.getInstance()
        if(firebaseAuth.currentUser!=null)
        {
            Handler().postDelayed({
            startActivity(Intent(this,browseractivities::class.java))
            finish()
            }, spalsh)
        }
        else {
            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, spalsh)
        }
    }
}