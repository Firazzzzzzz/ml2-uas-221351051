package com.example.loandefaultapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.loandefaultapp.TFLiteModel

class SimulasiActivity : AppCompatActivity() {

    private lateinit var model: TFLiteModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulasi)

        model = TFLiteModel(this)

        val usiaInput = findViewById<EditText>(R.id.inputUsia)
        val pendapatanInput = findViewById<EditText>(R.id.inputPendapatan)
        val pinjamanInput = findViewById<EditText>(R.id.inputPinjaman)
        val durasiInput = findViewById<EditText>(R.id.inputDurasi)
        val btnPredict = findViewById<Button>(R.id.btnPredict)
        val textResult = findViewById<TextView>(R.id.textResult)

        btnPredict.setOnClickListener {
            val usia = usiaInput.text.toString().toFloatOrNull() ?: 0f
            val pendapatan = pendapatanInput.text.toString().toFloatOrNull() ?: 0f
            val pinjaman = pinjamanInput.text.toString().toFloatOrNull() ?: 0f
            val durasi = durasiInput.text.toString().toFloatOrNull() ?: 0f

            val result = model.predict(floatArrayOf(usia, pendapatan, pinjaman, durasi))
            val defaultProb = result[1]  // asumsi indeks ke-1 = default

            val message = if (defaultProb > 0.5)
                "Beresiko Gagal Bayar (${(defaultProb * 100).toInt()}%)"
            else
                "Pembayaran Aman (${(defaultProb * 100).toInt()}%)"

            textResult.text = message
        }
    }
}
