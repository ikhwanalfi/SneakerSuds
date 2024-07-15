package com.example.sneakersuds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import androidx.appcompat.app.ActionBar

class CleaningActivity : AppCompatActivity() {
//    private lateinit var databaseReference: DatabaseReference
//    private lateinit var text1: TextView
//
//    databaseReference = FirebaseDatabase.getInstance().reference
//
//    // Mengambil nilai dari TextView dengan ID text_1
//    val text1Value = findViewById<TextView>(R.id.text_1).text.toString()
//
//    // Menyimpan nilai ke Firebase
//    saveToFirebase(text1Value)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cleaning)
    }
//    private fun saveToFirebase(value: String) {
//        // Mendapatkan referensi ke lokasi database yang diinginkan
//        // Misalnya, "jumlah_produk_a" adalah nama node di Firebase
//        val jumlahProdukARef = databaseReference.child("jumlah_produk_a")
//
//        // Menyimpan nilai ke Firebase
//        jumlahProdukARef.setValue(value)
//            .addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    // Data berhasil disimpan
//                    // Tambahkan tindakan atau feedback yang sesuai
//                } else {
//                    // Ada kesalahan dalam menyimpan data
//                    // Tambahkan tindakan atau feedback yang sesuai
//                }
//            }
//    }
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cleaning)
//
//        // Inisialisasi variabel TextView
//        text1 = findViewById(R.id.text_1)
//
//        // Mendapatkan nilai dari TextView dan menampilkannya dalam log
//        val valueFromText1 = text1.text.toString()
//        Log.d("CleaningActivity", "Value from text_1: $valueFromText1")
//
//    }

}
