package com.example.loandefaultapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btnDataset).setOnClickListener {
            startActivity(Intent(this, DatasetActivity::class.java))
        }

        findViewById<Button>(R.id.btnTentang).setOnClickListener {
            startActivity(Intent(this, TentangActivity::class.java))
        }

        findViewById<Button>(R.id.btnSimulasi).setOnClickListener {
            startActivity(Intent(this, SimulasiActivity::class.java)) // diarahkan ke prediksi
        }

        findViewById<Button>(R.id.btnModel).setOnClickListener {
            startActivity(Intent(this, ModelActivity::class.java))
        }

        findViewById<Button>(R.id.btnFitur).setOnClickListener {
            startActivity(Intent(this, FiturActivity::class.java))
        }
    }
}
