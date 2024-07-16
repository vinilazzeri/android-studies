package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

fun main() {

    val lista_nomes = listOf("jhin", "blitz", "pyke", "nunu")
    val lista_numeros = listOf(6, 2, 5, 4, 3, 1)

    //val nova_lista_numeros = lista_numeros.sorted()
    //val nova_lista_numeros = lista_numeros.sortedDescending()

    val nova_lista_nomes1 = lista_nomes.sorted()
    val nova_lista_nomes2 = lista_nomes.sortedDescending()

    println(nova_lista_nomes2)
    println(nova_lista_nomes1)
    
}