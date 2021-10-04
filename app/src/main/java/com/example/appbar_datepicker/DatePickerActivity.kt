package com.example.appbar_datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import java.util.*

class DatePickerActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        supportActionBar!!.title = "Testando Menu" // se tiver barra. põe titulo
        supportActionBar!!.subtitle = "Aprendendo a lidar com menus"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        //criando calnedário
            //instancia um objeto calendário
                val calendario = Calendar.getInstance()

            //Buscando as informações do calendário. Faz com que o calendário abra na data de hoje
                val ano = calendario.get(Calendar.YEAR) // ano
                val mes = calendario.get(Calendar.MONTH) // mês
                val dia = calendario.get(Calendar.DAY_OF_MONTH) // ano

            //abrir date picker
                val etDataNascimento = findViewById<EditText>(R.id.et_data)
                etDataNascimento.setOnClickListener {
                    val dp = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ view, _ano, _mes, _diaDoMes -> etDataNascimento.setText("$_diaDoMes/${_mes+1}/$_ano")}, ano, mes, dia)
                    //Argumentos para datePickerDialog:
                        // - Onde o calendário vai aparecer (na mesma tela)
                        // - Fução: quando uma data for escolhida ("OnDateSetListener"), vai disparar a função de seta que guarda a data escolhida no calendário e depois joga isso no TextView no formato BR
                        // - data, mes e ano que estarão no calendário ao abrir.

                    dp.show()
                }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.menu_teste, menu) //inflando o menu que a função traz com o menu criado no arquivo.
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
       /* if (item.itemId == R.id.menu_save)
        {
            Toast.makeText(this, "Perfil Salvo", Toast.LENGTH_SHORT).show()
        }
        else if (item.itemId == R.id.menu_settings)
        {
            Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
        }*/

        when(item.itemId)
        {
            R.id.menu_save ->
            {
                Toast.makeText(this, "Perfil Salvo", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_settings ->
            {
                Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_profile ->
            {
                Toast.makeText(this, "Perfil Um", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_profile2 ->
            {
                Toast.makeText(this, "Perfil Dois", Toast.LENGTH_SHORT).show()
            }


        }
        return true;
    }
}