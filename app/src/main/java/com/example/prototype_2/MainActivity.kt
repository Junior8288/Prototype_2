package com.example.prototype_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var btnPolicy: Button
    private lateinit var btnCall : Button
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnPolicy = findViewById(R.id.btnPolicy)

        btnPolicy.setOnClickListener {
            val intent = Intent(this, Policy_Page::class.java)
            startActivity(intent)
        }
        val btnWhatsapp = findViewById<FloatingActionButton>(R.id.btnWhatsapp)

        btnWhatsapp.setOnClickListener {
            val intent = Intent(this, Staff_Page::class.java)
            startActivity(intent)
        }

        val btnChatbot = findViewById<FloatingActionButton>(R.id.btnChatbot)

        btnChatbot.setOnClickListener {
            val intent = Intent(this, Chatbot_Page::class.java)
            startActivity(intent)
        }

        btnCall = findViewById(R.id.btnCall)

        btnCall.setOnClickListener {
            val intent = Intent(this, Chatbot_Page::class.java)
            startActivity(intent)
        }

        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this, Register_Page::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}