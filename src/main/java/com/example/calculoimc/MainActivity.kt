package com.example.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<EditText>(R.id.nome)
        val calcular = findViewById<Button>(R.id.calcular)

        calcular.setOnClickListener {
            val peso = findViewById<EditText>(R.id.peso).text.toString().toDouble()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val resultado = findViewById<TextView>(R.id.resultado)

            val imc =  peso / (altura * altura)

            if (imc <= 18){
                resultado.text = "Você esta abaixo do peso " + "${imc}"
            }else if (imc <=24){
                resultado.text = "Voce esta dentro do peso" + "${imc}"
            }


        }


    }
}