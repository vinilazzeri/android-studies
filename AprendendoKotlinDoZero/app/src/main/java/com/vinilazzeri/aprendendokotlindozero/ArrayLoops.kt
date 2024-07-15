package com.vinilazzeri.aprendendokotlindozero

fun main(){

    /*val nomes = arrayOf(
        "vini", "ana", "banana"
    )
    println(nomes[0])*/

    /*var numero = 1
    while (numero in 1..9){
        println("executou $numero")
        numero++
    }*/

    /*for(numero in 1..5){
        println(numero)
    }*/

    var postagens = arrayOf(
        "viagem",
        "praia",
        "confusao",
        "churrasco"
    )

    /*for (postagem in postagens){
        println("titulo: $postagem")
    }*/

    for((indice, postagem) in postagens.withIndex()){
        println("$indice: $postagem")
    }

}