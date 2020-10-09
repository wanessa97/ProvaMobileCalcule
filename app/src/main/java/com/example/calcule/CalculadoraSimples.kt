package com.example.calcule

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculadora_simples.*

class CalculadoraSimples : AppCompatActivity() {

    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operation: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_simples)

        limpar.setOnClickListener {
            num1=0.0
            num2=0.0
            ResultadoTextView.text="0"
            operation= N_OPERATION

        }




        um.setOnClickListener {numeroClicado(digito = "1") }
        dois.setOnClickListener {numeroClicado(digito = "2") }
        tres.setOnClickListener {numeroClicado(digito = "3") }
        quatro.setOnClickListener {numeroClicado(digito = "4") }
        cinco.setOnClickListener {numeroClicado(digito = "5") }
        seis.setOnClickListener {numeroClicado(digito = "6") }
        sete.setOnClickListener {numeroClicado(digito = "7") }
        oito.setOnClickListener {numeroClicado(digito = "8") }
        nove.setOnClickListener {numeroClicado(digito = "9") }
        zero.setOnClickListener {numeroClicado(digito = "0") }

        soma.setOnClickListener{operacaoClicada(SOMA)}
        subtrair.setOnClickListener{operacaoClicada(SUBTRACAO)}
        dividir.setOnClickListener{operacaoClicada(DIVISAO)}
        multiplicar.setOnClickListener{operacaoClicada(MULTIPLICACAO)}

        igual.setOnClickListener {
            var resultadoT = when(operation){

                SOMA -> num1 + num2
                SUBTRACAO -> num1 - num2
                DIVISAO -> num1 / num2
                MULTIPLICACAO -> num1 + num2
                else -> 0.0

            }

            ResultadoTextView.text = resultadoT.toString()
        }



    }

    private fun numeroClicado(digito: String){

        ResultadoTextView.text = "${ResultadoTextView.text}$digito"

        if (operation == N_OPERATION){
            num1 = ResultadoTextView.text.toString().toDouble()
        } else{

            num2 = ResultadoTextView.text.toString().toDouble()
        }

    }

    private fun operacaoClicada(operation: Int){
        this.operation = operation

        num1 = ResultadoTextView.text.toString().toDouble()

        ResultadoTextView.text = "0"

    }

    companion object{
        const val SOMA = 1
        const val SUBTRACAO = 2
        const val MULTIPLICACAO = 3
        const val DIVISAO = 4
        const val N_OPERATION = 5
    }

}






