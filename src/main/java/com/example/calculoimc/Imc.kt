package com.example.calculoimc

import android.widget.TextView

class Imc {

    fun calcularImc(altura: Double, peso: Double): String{
        val resultado = findViewById<TextView>(R.id.resultado).text

        val imc =  peso / (altura * altura)

        if (imc <= 18){
            resultado.text = "Você esta abaixo do peso, " + "seu imc é de:" + "${imc}"
        }else if (imc <=24){
            resultado.text = "Voce esta dentro do peso, " + "seu imc é de:" + "${imc}"
        }else if (imc <= 29){
            resultado.text = "voce esta acima do peso, " + "seu imc é de:"+ "${imc}"
        }else if (imc <=34) {
            resultado.text = "voce tem obesidade gral I, " + "seu imc é de:" + "${imc}"
        }else if (imc<= 49){
            resultado.text = "voce tem obesidade gral II, " +"seu imc é de:"+ "${imc}"
        }
    }
}