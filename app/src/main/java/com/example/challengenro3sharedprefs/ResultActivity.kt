package com.example.challengenro3sharedprefs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.challengenro3sharedprefs.LoginAplication.Companion.preferences

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        initUI()
    }

    private fun initUI() {
        val btSignOut = findViewById<Button>(R.id.btSignOut)
        val tvName = findViewById<TextView>(R.id.tvName)

        val userName = preferences.getUserName()

        btSignOut.setOnClickListener{
            preferences.wipe()
            onBackPressed()
        }

        tvName.text = "Welcome $userName"

    }
}