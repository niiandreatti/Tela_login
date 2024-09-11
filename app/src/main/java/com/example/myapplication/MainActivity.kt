package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log
import android.util.Log

class MainActivity : AppCompatActivity() {
    lateinit var emailInput: EditText
    lateinit var passwordInput: EditText
    lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         emailInput = findViewById(R.id.editTextTextEmailAddress)
         passwordInput = findViewById(R.id.editTextTextPassWord)
         sendButton = findViewById(R.id.button)

        sendButton.setOnClickListener {
            var email = emailInput.text.toString()
            var password = passwordInput.text.toString()

            Log.i("Test credentials", "Email: $email")
            Log.i("Test credentials", "Password: $password")

        }

        }
    }
