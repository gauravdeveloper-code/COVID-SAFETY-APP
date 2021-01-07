package com.example.covidsafety
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAuth= FirebaseAuth.getInstance()
        login.setOnClickListener {
            startActivity(Intent(this@MainActivity,Page2::class.java))
            finish()
        }
        signup_button.setOnClickListener {
            if(person_name.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"PLEASE ENTER NAME",Toast.LENGTH_SHORT).show()
            }
            else if(person_mail.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"PLEASE ENTER EMAIL",Toast.LENGTH_SHORT).show()
            }
           else if(person_password.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"PLEASE ENTER PASSWORD",Toast.LENGTH_SHORT).show()
            }
            else if(person_password.text.toString().length<6)
            {
                Toast.makeText(this,"Password should have atleast 6 characters",Toast.LENGTH_SHORT).show()
            }
            else if(person_age.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"PLEASE ENTER AGE",Toast.LENGTH_SHORT).show()
            }

           else{
                var storename:String=person_name.text.toString()
                signupuser()
            }
        }

    }
    private fun signupuser(){
        val signupname:String = person_name.text.toString()
        val email:String = person_mail.text.toString()
        val password:String = person_password.text.toString()
        val signupage:String = person_age.text.toString()
        firebaseAuth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if(it.isSuccessful)
                {
                    Toast.makeText(this,"Account Created Successfully",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,browseractivities::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    Toast.makeText(this,"Enter Valid Email Address",Toast.LENGTH_SHORT).show()
                }
            }
    }
}


