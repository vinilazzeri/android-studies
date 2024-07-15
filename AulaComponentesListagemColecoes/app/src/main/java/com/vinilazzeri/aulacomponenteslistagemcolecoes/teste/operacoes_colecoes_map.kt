package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste



fun main(){

    val lista = listOf("jhin", "blitz", "pyke", "nunu")

    /*val nova_lista = mutableListOf<String>()

    lista.forEach { nome ->
        nova_lista.add(nome.uppercase())
    }*/

    /*val nova_lista = lista.map { nome ->
        nome.uppercase()
    }*/

    val nova_lista = lista.map { it.uppercase() }

    println(nova_lista)
}