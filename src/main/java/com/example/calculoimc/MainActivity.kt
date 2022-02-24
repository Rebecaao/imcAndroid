package com.example.calculoimc

 lateinit var nomeEditText : EditText
 lateinit var pesoEditText: EditText
 lateinit var alturaEditText: EditText




import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val calcular = findViewById<Button>(R.id.calcular)

        calcular.setOnClickListener {

            nomeEditText = findViewById(R.id.nome)
            pesoEditText = findViewById(R.id.peso)
            alturaEditText = findViewById(R.id.altura)







        }

        validarCampo()

    }

    private fun validarCampo(): Boolean {
        var noError = true

        if (nomeEditText.text.isBlank()){
            nomeEditText.setError("Digite o seu nome")
            noError = false
        }
        if (alturaEditText.text.isBlank()){
            alturaEditText.setError("Digite a sua altura")
            noError = false
        }
        if (pesoEditText.text.isBlank()){
            pesoEditText.setError("Digite o seu peso")
            noError = false
        }
        return noError

    }
}