package com.example.fcilcombustvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.view.ViewDebug
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        fun sendMessage (view: View){
            val editText = findViewById<EditText>(R.id.alcoolID)
            val message = editText.text.toString()
            val intent = Intent (this, DistanciaActivity::class.java).apply{
                putExtra(EXTRA_MESSAGE, message)

            }

        val precoGasolina = findViewById<EditText>(R.id.gasolinaID)
        val precoAlcool = findViewById<EditText>(R.id.alcoolID)
        val nextBootom = findViewById<Button>(R.id.nextBootom)


        nextBootom.setOnClickListener {
            val alcool1 = Integer.parseInt(precoAlcool.text.toString())
            val gasolina1 = Integer.parseInt(precoGasolina.text.toString())
        }

    }


        startActivity(intent)



    }
    private fun putExtra(extraMessage: String, callButton: Button?) {

    }

}