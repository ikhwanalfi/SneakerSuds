package com.example.sneakersuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MethodPaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_method_payment)
        supportActionBar?.hide()

        // Mendapatkan referensi ke ImageButton
        val goPaymentButton1: ImageView = findViewById(R.id.p1)
        val goPaymentButton2: ImageView = findViewById(R.id.p2)
        val goPaymentButton3: ImageView = findViewById(R.id.p3)

        // Menangani klik pada ImageButton
        goPaymentButton1.setOnClickListener {
            val intent = Intent(this, SuccessPaymentActivity::class.java)
            startActivity(intent)
        }
        goPaymentButton2.setOnClickListener {
            val intent = Intent(this, SuccessPaymentActivity::class.java)
            startActivity(intent)
        }
        goPaymentButton3.setOnClickListener {
            val intent = Intent(this, SuccessPaymentActivity::class.java)
            startActivity(intent)
        }
    }
}