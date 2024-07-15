package com.example.sneakersuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        supportActionBar?.hide()

        // Mendapatkan referensi ke ImageButton
        val goPaymentButton: ImageView = findViewById(R.id.btnbayar)

        // Menangani klik pada ImageButton
        goPaymentButton.setOnClickListener {
            val intent = Intent(this, MethodPaymentActivity::class.java)
            startActivity(intent)
        }
    }


}