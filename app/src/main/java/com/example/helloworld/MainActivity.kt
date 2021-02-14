package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: Button = calcular
        val resultado: TextView = resultado

        btCalcular.setOnClickListener {
            val inputN1: String = nota1.text.toString()
            val inputN2: String = nota2.text.toString()
            val inputFaltas: String = faltas.text.toString()

            if (inputN1.isEmpty()) {
                resultado.setText("'Nota 1' faltando")
                resultado.setBackgroundColor(Color.parseColor("#b71c1c"))
            }else if (inputN2.isEmpty()) {
                resultado.setText("'Nota 2' faltando")
                resultado.setBackgroundColor(Color.parseColor("#b71c1c"))
            }else if (inputFaltas.isEmpty()){
                resultado.setText("Preencha o campo 'Faltas'")
                resultado.setBackgroundColor(Color.parseColor("#b71c1c"))
            }else {
                val media: Float = (inputN1.toFloat() + inputN2.toFloat())/2
                if (media >= 6 && inputFaltas.toInt() <= 10) {
                    resultado.setText("Aluno Aprovado\n Nota final: " + media + "\n Faltas: " + inputFaltas)
                    resultado.setBackgroundColor(Color.parseColor("#1b5e20"))
                } else {
                    resultado.setText("Aluno Reprovado\n Nota final: " + media + "\n Faltas: " + inputFaltas)
                    resultado.setBackgroundColor(Color.parseColor("#b71c1c"))
                }

                nota1.setText("")
                nota2.setText("")
                faltas.setText("")
            }
        }
    }
}

