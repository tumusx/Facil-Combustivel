package com.example.fcilcombustvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewDebug
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val precoGasolina = findViewById<EditText>(R.id.gasolinaID)
        val precoAlcool = findViewById<EditText>(R.id.alcoolID)
        val nextBootom = findViewById<Button>(R.id.nextBootom)


        nextBootom.setOnClickListener {
            val alcool1 = Integer.parseInt(precoAlcool.text.toString())
            val gasolina1 = Integer.parseInt(precoGasolina.text.toString())
        }


    }
}