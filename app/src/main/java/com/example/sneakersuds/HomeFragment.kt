// HomeFragment.kt
package com.example.sneakersuds

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Mendapatkan referensi ke RelativeLayout btn_cleaning
        val btnCleaning: RelativeLayout = view.findViewById(R.id.btn_cleaning)

        // Menangani klik pada btn_cleaning
        btnCleaning.setOnClickListener {
            val intent = Intent(activity, CleaningActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}