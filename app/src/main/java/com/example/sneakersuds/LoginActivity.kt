package com.example.sneakersuds;

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sneakersuds.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.newFixedThreadPoolContext

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.textRegisterLogin.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignIn.setOnClickListener {
            val email = binding.editEmailLogin.text.toString()
            val password = binding.editPasswordLogin.text.toString()
            //validasi email
            if (email.isEmpty()) {
                binding.editEmailLogin.error = "Isi Email"
                binding.editEmailLogin.requestFocus()
                return@setOnClickListener
            }
            //validasi email valid
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.editEmailLogin.error = "Email Tidak Valid"
                binding.editEmailLogin.requestFocus()
                return@setOnClickListener
            }
            //validasi password tidak diisi
            if (password.isEmpty()) {
                binding.editPasswordLogin.error = "Pasword harus diisi"
                binding.editPasswordLogin.requestFocus()
                return@setOnClickListener
            }
            //validasi password harus 8 karakter
            if (password.length > 8) {
                binding.editPasswordLogin.error = "Pasword harus lebih dari 8 karakter"
                binding.editPasswordLogin.requestFocus()
                return@setOnClickListener
            }
            LoginFirebase(email, password)

        }
    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}