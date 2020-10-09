package com.example.calcule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calcuSimples.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculadoraSimples::class.java)
            startActivity(intent)
        }

        CalDesconto.setOnClickListener{
            val intent = Intent(this@MainActivity, CalculadoraDescontos::class.java)
            startActivity(intent)
        }

        ConTempe.setOnClickListener {
            val intent = Intent(this@MainActivity, ConversorTemperatura::class.java )
            startActivity(intent)
        }

    }





}