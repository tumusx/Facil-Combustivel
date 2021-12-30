package com.example.fcilcombustvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.view.ViewDebug
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val dotsIndicator = findViewById<WormDotsIndicator>(R.id.dots_indicator)
        val viewPager = findViewById<ViewPager>(R.id.viewPager2)

        val itensCombostivel: DistanciaActivity

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGo.setOnClickListener{
            otherActivity()

        }
            /*btnPrevius.setOnClickListener {
                previusActivity()
            }*/
        }



    private fun otherActivity(){
        val intent = Intent(this, DistanciaActivity::class.java)
        startActivity(intent)
    }
    /*private fun previusActivity(){
        val intent = Intent(this, MainActivity::class.java)
        previusActivity()
    }*/




}




