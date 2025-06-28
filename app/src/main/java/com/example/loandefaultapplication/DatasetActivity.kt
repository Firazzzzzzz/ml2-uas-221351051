package com.example.loandefaultapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DatasetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dataset) // ⬅️ Ini harus cocok

        val textSummary = findViewById<TextView>(R.id.textSummary)
        val textSample = findViewById<TextView>(R.id.textSample)

        val summary = """
            • Total baris: 10000
            • Fitur: Usia, Pendapatan Bulanan, Jumlah Pinjaman, Durasi Pinjaman, Status Default
            • Tipe masalah: Klasifikasi biner
        """.trimIndent()

        val sample = """
            usia | pendapatan | pinjaman | durasi | default
            -----------------------------------------------
            32   | 4500       | 15000    | 12     | 0
            45   | 5200       | 20000    | 24     | 1
            29   | 3800       | 8000     | 10     | 0
            40   | 7000       | 12000    | 8      | 0
            36   | 6100       | 17000    | 15     | 1
        """.trimIndent()

        textSummary.text = summary
        textSample.text = sample
    }
}
