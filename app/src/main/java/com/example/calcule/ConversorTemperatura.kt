package com.example.calcule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_conversor_temperatura.*

class ConversorTemperatura : AppCompatActivity() {

    var valorGrauC = 0.0
    var valorGrauF = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor_temperatura)


        limpar1.setOnClickListener { GrausCeusius.setText(""); ResultadoF.setText(""); GrauFahrenheit.setText(""); ResultadoC.setText("") }

        converteParaCelsius()
        converteParaFahrenheit()
    }

    private fun converteParaCelsius() {

        ConverterFahrenheit.setOnClickListener{
            val valorC = GrausCeusius.text.toString().toDouble()
            valorGrauC = (valorC * 1.8) + 32
            ResultadoF.text = valorGrauC.toString()
        }


        }


    private fun converteParaFahrenheit(){
        ConverterCeusius.setOnClickListener {
            val valorF = GrauFahrenheit.text.toString().toDouble()
            valorGrauF = (valorF - 32) / 1.8
            ResultadoC.text = valorGrauF.toString()
        }

    }
    }



