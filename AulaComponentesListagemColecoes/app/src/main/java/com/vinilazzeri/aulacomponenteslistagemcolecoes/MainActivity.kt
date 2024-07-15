package com.vinilazzeri.aulacomponenteslistagemcolecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/*class Usuario {

    companion object{
        val nome: String = ""
    }
}*/


class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnExecutar = findViewById(R.id.btn_executar)
        txtResultado = findViewById(R.id.text_resultado)

    }
/*    fun cliqueBotao(view: View) {
        Toast
            .makeText(
                this,
                "sucesso ao fazer algo",
                Toast.LENGTH_LONG
            ).show()
        txtResultado.text = "vini"
    }*/
}


