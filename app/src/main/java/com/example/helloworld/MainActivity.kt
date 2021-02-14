package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: Button = calcular
        val resultado: TextView = resultado

        btCalcular.setOnClickListener {
            val nota1: Int = Integer.parseInt(nota1.text.toString())
            val nota2: Int = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media >= 6 && faltas <=10){
                resultado.setText("Aluno Aprovado\n Nota final: "+ media + "\n Faltas: "+faltas)
            }else {
                resultado.setText("Aluno Reprovado\n Nota final: "+ media + "\n Faltas: "+faltas)
            }
        }

    }
}