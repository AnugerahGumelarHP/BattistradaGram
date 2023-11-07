package com.example.battistradagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.battistradagram.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener{
            register()
        }

        binding.tvLoginSekarang.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun register() {
        val namalengkap = binding.edtFullName.text.toString()
        val email = binding.edtEmail.text.toString()
        val password = binding.edtPassword.text.toString()
        val confirmpassword = binding.edtReConfirmPassword.text.toString()

        if (validateLogin(namalengkap,email,password,confirmpassword)){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
        }
    }

    private fun validateLogin(namalengkap: String, email: String, password: String, confirmpassword: String): Boolean {
        return namalengkap == "admin" && email == "admin" &&
                password == "password" && confirmpassword == "password"
    }

}