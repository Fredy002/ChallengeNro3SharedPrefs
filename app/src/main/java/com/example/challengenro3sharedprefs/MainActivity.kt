package com.example.challengenro3sharedprefs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.challengenro3sharedprefs.LoginAplication.Companion.preferences

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        checkUserValues()
    }

    private fun checkUserValues() {
        if (preferences.getUserName().isNotEmpty()){
            // ir a la siguiente pantalla
            goToDetail()
        }
        else{
            // otra cosa
        }
    }

    private fun initUI() {
        val btLogin = findViewById<Button>(R.id.btLogin)

        btLogin.setOnClickListener{
            accesToDetail()
        }
    }

    private fun accesToDetail() {
        val etUserName = findViewById<EditText>(R.id.etUserName)

        if(etUserName.text.toString().isNotEmpty()){
            // Guardar el valor del usuario
            preferences.saveUserName(etUserName.text.toString())
            preferences.savePassword(etUserName.text.toString())
            goToDetail()
        }
        else{
            // Notificacion flotante que el campo esta vacio

        }
    }

    private fun goToDetail(){
        startActivity(Intent(this, ResultActivity::class.java))
    }
}