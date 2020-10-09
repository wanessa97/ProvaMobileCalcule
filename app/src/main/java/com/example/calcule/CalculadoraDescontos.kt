package com.example.calcule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculadora_descontos.*
import kotlinx.android.synthetic.main.activity_calculadora_simples.*

class CalculadoraDescontos : AppCompatActivity() {

    var valor: Double = 0.0
    var valorEconomizado = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_descontos)

        limpar3.setOnClickListener { valorTotal.setText(""); porcentagemDesconto.setText(""); resultadoValor.setText(""); valorDesconto.setText("") }

        calcularPorcentagem()

    }

    private fun calcularPorcentagem( ){



        calcularPorce.setOnClickListener {

            val precoTotal  = valorTotal.text.toString().toDouble()
            val prct  = porcentagemDesconto.text.toString().toDouble()


            valorEconomizado = (precoTotal * prct) /100
            valorDesconto.text = valorEconomizado.toString()

            valor = (precoTotal - valorEconomizado)
            resultadoValor.text = valor.toString()


        }


    }




    }


