package com.example.victor_continuada_1

import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View) {

        val nome = et_nome.text

        if (
                et_coca.text.isNotEmpty() && et_hamburguer.text.isNotEmpty() &&
                et_fritas.text.isNotEmpty() && nome.isNotEmpty()
        ) {

            val coca = et_coca.text.toString().toDouble() * 295
            val hamburguer = et_hamburguer.text.toString().toDouble() * 312
            var fritas = et_fritas.text.toString().toDouble() * 149
            val totalCalorias = coca + hamburguer + fritas


            if (totalCalorias < 1200) {
                tv_resultado.text =
                        "$nome, $totalCalorias Calorias foram ingeridas, ta comendo pouco, vai mais pro MC"
                tv_resultado.setTextColor(YELLOW)
            } else if (totalCalorias > 2000) {
                tv_resultado.text = "$nome, $totalCalorias Calorias foram ingeridas, opa, vai com" +
                        " calma no MC Lanche"
                tv_resultado.setTextColor(RED)
            } else {
                tv_resultado.text = "$nome, $totalCalorias Calorias foram ingeridas, aí sim," +
                        " ta saudavel"
                tv_resultado.setTextColor(GREEN)
            }
        } else {
            tv_resultado.text = "Preencha os campos corretamente"
        }

        tv_resultado.visibility = VISIBLE
    }

}