package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

fun main() {

    //val listaFrutas = listOf("maça", "laranja", "banana")
    //val lista_vendas = listOf(100, 500, 1000, 1200, 145, 300, 4320)

    val nomes = listOf("jhin", "blitz", "pyke", "nunu")

    /*val lista_frutas = listaFrutas.filter { fruta ->
        fruta == "laranja"
    }
    println(lista_frutas)*/
    /*val nova_lista = lista_vendas.filter { valor ->
        valor >= 600 // condicao true or false
    }*/

    /*val nova_lista = lista_vendas.filter { it >= 500 }
    val nova_lista = lista_vendas.filter { it >= 500 }
    println(nova_lista)*/

    val nova_lista = nomes.filter {nome ->
        nome.contains("i")
    }
    println(nova_lista)
}