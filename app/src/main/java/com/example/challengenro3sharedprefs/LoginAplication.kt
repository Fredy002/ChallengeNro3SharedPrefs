package com.example.challengenro3sharedprefs

import android.app.Application

// la clase se ejecuta antes de que se ejecute la app (main activity)
class LoginAplication:Application() {

        companion object{
            lateinit var preferences:Preferences
        }

        override fun onCreate() {
            super.onCreate()
            preferences = Preferences(applicationContext)
        }
}