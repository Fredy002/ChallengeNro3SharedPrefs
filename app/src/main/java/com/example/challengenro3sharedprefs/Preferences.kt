package com.example.challengenro3sharedprefs

import android.content.Context

class Preferences (val context: Context){

    val SHARED_NAME = "myDataBase"
    val SHARED_USER_NAME = "userName"
    val SHARED_PASSWORD = "password"

    val storage = context.getSharedPreferences(SHARED_NAME, 0)

    // Guardar el valor del usuario
    fun saveUserName(userName:String){
        storage.edit().putString(SHARED_USER_NAME, userName).apply()
    }

    // Guardar el valor del password
    fun savePassword(password:String){
        storage.edit().putString(SHARED_PASSWORD, password).apply()
    }

    // Obtener el valor del usuario
    fun getUserName():String{
        return storage.getString(SHARED_USER_NAME, "")!!
    }

    // Obtener el valor del password
    fun getPassword():String{
        return storage.getString(SHARED_PASSWORD, "")!!
    }

    fun wipe(){
        storage.edit().clear().apply()
    }
}