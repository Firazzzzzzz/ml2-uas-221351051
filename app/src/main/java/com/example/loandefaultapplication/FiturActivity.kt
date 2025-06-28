package com.example.loandefaultapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FiturActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitur)

        val fiturText = findViewById<TextView>(R.id.textFitur)
        fiturText.text = """
Aplikasi Prediksi Loan Default - Fitur:

• Simulasi Prediksi:
  Memasukkan usia, pendapatan, jumlah pinjaman, dan durasi pinjaman, lalu memprediksi kemungkinan gagal bayar.

• Tampilan Dataset:
  Menampilkan ringkasan dan contoh data dari dataset asli untuk referensi pengguna.

• Penjelasan Model:
  Menampilkan kode training model yang digunakan (Random Forest) dan evaluasinya.

• Informasi Aplikasi:
  Penjelasan singkat tentang tujuan aplikasi dan manfaatnya.

• Navigasi Mudah:
  5 tombol utama untuk berpindah antar halaman: Dataset, Tentang Aplikasi, Simulasi, Model, dan Fitur.
        """.trimIndent()
    }
}
