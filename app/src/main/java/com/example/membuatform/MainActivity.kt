package com.example.membuatform

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets }
            val emailEditText = findViewById<TextInputEditText>(R.id.editemail)
            val usernameEditText = findViewById<TextInputEditText>(R.id.editusername)
            val fullnameEditText = findViewById<TextInputEditText>(R.id.editfullname)
            val passwordEditText = findViewById<TextInputEditText>(R.id.editpassword)

            // Dapatkan referensi untuk tombol sign up
            val signUpButton = findViewById<Button>(R.id.btnsignUp)

            // Set onClickListener untuk tombol sign up
            signUpButton.setOnClickListener {
                // Ambil teks dari input email dan username
                val email = emailEditText?.text.toString()
                val username = usernameEditText?.text.toString()

                // Tampilkan Toast dengan pesan email dan username
                Toast.makeText(this, "Selamat datang $email dengan nama pengguna $username", Toast.LENGTH_LONG).show()
                emailEditText?.setText("")
                usernameEditText?.setText("")
                fullnameEditText?.setText("")
                passwordEditText?.setText("")
            }
    }
}