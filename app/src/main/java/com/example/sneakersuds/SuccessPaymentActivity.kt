package com.example.sneakersuds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class SuccessPaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_payment)
        supportActionBar?.hide()

        val goPaymentButton: CardView = findViewById(R.id.tvSuccess2)

        // Menangani klik pada ImageButton
        goPaymentButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)
        }
    }
}