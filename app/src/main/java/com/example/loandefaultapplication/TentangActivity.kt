package com.example.loandefaultapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TentangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)

        val textTentang = findViewById<TextView>(R.id.textTentang)

        val deskripsi = """
            Aplikasi ini bertujuan untuk membantu memprediksi risiko gagal bayar pinjaman berdasarkan data pengguna seperti usia, pendapatan, jumlah pinjaman, dan durasi pinjaman.
            
            Dengan menggunakan model Machine Learning yang telah dilatih pada dataset nyata, aplikasi ini dapat memberikan estimasi apakah seorang peminjam berisiko default atau tidak.

            Fitur Aplikasi:
            • Input data peminjam (usia, pendapatan, pinjaman, durasi)
            • Prediksi risiko gagal bayar
            • Visualisasi data dan informasi model

            Aplikasi ini bersifat edukatif dan tidak digunakan untuk keputusan keuangan nyata.
        """.trimIndent()

        textTentang.text = deskripsi
    }
}
