package com.example.appbar_datepicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide() // se tiver a barra, ele vai esconder. Se não tiver, não faz nada

        val tvHello = findViewById<TextView>(R.id.tv_hello)
        tvHello.setOnClickListener {
            val abrirDatePickerActivity = Intent(this, DatePickerActivity::class.java)
            //contexto e "destino" ||||| ::class.java - instancia a classe

            startActivity(abrirDatePickerActivity)
        }
    }
}