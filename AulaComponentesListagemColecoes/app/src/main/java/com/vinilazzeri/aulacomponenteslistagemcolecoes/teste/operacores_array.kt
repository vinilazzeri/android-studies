package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste




fun main(){

    val lista = arrayOf("vini", 10, "cius")
    //println(lista[0])
    //println(lista.size)
    //println(lista.indexOf("vini"))
    /*println(lista.first())
    println(lista.last())*/
    //println(lista.contains("vini"))


    //val nova_lista = lista.plus("joao")
    //nova_lista.forEach { item ->
    lista.shuffle()
    lista.forEach { item ->
        println(item)
    }
}