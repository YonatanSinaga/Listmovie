package com.uas.listmovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pindahPage(view: View) {
        val intent = Intent(this, ListMovie::class.java).apply {
            // putExtra(, message)
        }
        startActivity(intent)
    }
}