package com.example.uchat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uchat.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val database: FirebaseDatabase = FirebaseDatabase.getInstance()
        val myRef: DatabaseReference = database.getReference("message")
        myRef.setValue("Hello, World!")

        bSend.setOnClickListener{
            myRef.setValue(edMessage.text.toString())
        }
    }
}