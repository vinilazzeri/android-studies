package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

fun main(){

    //0 -> "vini" 1-> "jhin"
    val lista_itens = listOf("vini", "jhin")
    //val lista = mapOf(3213 to "iphone", 1002 to "geladeira")
    val lista = mutableMapOf("nome" to "iphone", "preco" to 1002)

    println(lista["nome"])
    println(lista.size)
    lista.put("idade", 20)
    lista["idade"] = 20
    //lista.remove("nome")


    lista.forEach {produto ->
        println("${produto.key} - ${produto.value}")
    }

}