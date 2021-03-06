package com.example.myplantplan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cc17.myplantplan.MainActivity
import com.cc17.myplantplan.SettingsActivity
import kotlinx.android.synthetic.main.settings.*


class Dashboard : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        val btnGuide = findViewById<ImageView>(R.id.btnGuide)
        btnGuide.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btnFeedback = findViewById<ImageView>(R.id.btnFeedback)
        btnFeedback.setOnClickListener{
            val intent = Intent(this,Feedback::class.java)
            startActivity(intent)
        }
        val btnSettings = findViewById<ImageView>(R.id.btnSettings)
        btnSettings.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        val btnCall = findViewById<ImageView>(R.id.btnContact)
        btnCall.setOnClickListener {
            val intentCall = Intent(this, ContactUs::class.java)
                startActivity(intentCall)
        }

    }
}
