@file:Suppress("UNREACHABLE_CODE")

package com.example.sneakersuds

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sneakersuds.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import java.util.jar.Attributes.Name

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.textSignInRegister.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnSignUpRegister.setOnClickListener{
            val nama = binding.editNamaRegister.text.toString()
            val email = binding.editEmailRegister.text.toString()
            val password = binding.editPasswordRegister.text.toString()

            //validasi nama
            if (nama.isEmpty()){
                binding.editNamaRegister.error = "Isi Nama"
                binding.editNamaRegister.requestFocus()
                return@setOnClickListener
            }
            //validasi email
            if (email.isEmpty()){
                binding.editEmailRegister.error = "Isi Email"
                binding.editEmailRegister.requestFocus()
                return@setOnClickListener
            }
            //validasi email valid
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.editEmailRegister.error = "Email Tidak Valid"
                binding.editNamaRegister.requestFocus()
                return@setOnClickListener
            }
            //validasi password tidak diisi
            if (password.isEmpty()){
                binding.editPasswordRegister.error = "Pasword harus diisi"
                binding.editPasswordRegister.requestFocus()
                return@setOnClickListener
            }
            //validasi password harus 8 karakter
            if (password.length >8){
                binding.editPasswordRegister.error = "Pasword harus lebih dari 8 karakter"
            binding.editPasswordRegister.requestFocus()
            return@setOnClickListener
            }
            RegisterFirebase(email, password)
        }
    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful){
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
        }
    }
}