package com.example.myplantplan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.cc17.myplantplan.Thanks

class Feedback : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feedback)

        val btnThanks = findViewById<Button>(R.id.button)
        btnThanks.setOnClickListener {
            val intent = Intent(this, Thanks::class.java)
            startActivity(intent)
        }

    }
}