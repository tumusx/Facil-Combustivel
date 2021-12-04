package com.example.fcilcombustvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewDebug
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            setContentView(R.layout.activity_main)
        val precoGasolina = findViewById(R.id.gasolinaID) as EditText
        val precoAlcool  = findViewById(R.id.alcoolID) as EditText
        val modeloCarro = findViewById(R.id.modeloCarroID) as EditText
        val botãoNexT = findViewById(R.id.button) as Button


        botãoNexT.setOnClickListener {
        }


    }
}