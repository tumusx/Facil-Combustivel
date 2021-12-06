package com.example.fcilcombustvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class DistanciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distancia)
        val nextBootom = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.textView2).apply {
            text = nextBootom.toString()
        }}}

       /* val calcularPreco = findViewById<Button>(R.id.btCalcular)
        val distanciaKM = findViewById<EditText>(R.id.rvDistanciaIda)*/
       private fun Intent.getIntExtra(extraMessage: String) {


    }