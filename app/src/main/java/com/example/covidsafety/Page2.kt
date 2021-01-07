package com.example.covidsafety

import android.R.attr.bitmap
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page2.*

class Page2 : AppCompatActivity() {
    lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        firebaseAuth = FirebaseAuth.getInstance()
        signup_link.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        login_button.setOnClickListener {
            if(login_email.text.toString().isEmpty()){
                Toast.makeText(this,"PLEASE ENTER EMAIL",Toast.LENGTH_SHORT).show()
            }
            else if(login_password.text.toString().isEmpty()){
                Toast.makeText(this,"PLEASE ENTER PASSWORD",Toast.LENGTH_SHORT).show()
            }
            else{
                login()
            }
        }
    }

    private fun login(){
        val email: String = login_email.text.toString()
        val password : String = login_password.text.toString()
        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){
            if(it.isSuccessful){
                Toast.makeText(this,"Welcome back.",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,browseractivities::class.java))
                finish()
            }
            else{
                Toast.makeText(this,"Wrong id or password",Toast.LENGTH_SHORT).show()
            }
        }

    }

}