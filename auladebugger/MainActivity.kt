package com.vinilazzeri.auladebugger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    val lista_usuarios = listOf("vini", "ana", "maria", "joao")
    exibirListaItens(lista_usuarios)

    }

    private fun exibirListaItens(lista_usuarios: List<String>) {
        var exibir_primeiro_usuario = true
        var contador_itens = 0 // breakpoint (ponto de parada)


        for (user in lista_usuarios){

            if (exibir_primeiro_usuario){
                println("primeiro user")
                exibir_primeiro_usuario = false
            }
            println(user)
            contador_itens++
        }
    }
}