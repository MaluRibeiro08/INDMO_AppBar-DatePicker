package com.example.appbar_datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class DatePickerActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        supportActionBar!!.title = "Testando Menu" // se tiver barra. põe titulo
        supportActionBar!!.subtitle = "Aprendendo a lidar com menus"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.menu_teste, menu) //inflando o menu que a função traz com o menu criado no arquivo.
        return true
    }
}