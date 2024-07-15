package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

data class Carro(
    val nome: String,
    val marca: String
)

fun main(){

    //sets sao necessarios caso eu queira me certificar
    //que nao vai ter valores repetidos numa lista
    //val lista = setOf("jhin", "shyv", "nunu", "will", "annie", "kayle", "jhin")

    //val nova_lista = lista.plus("blitz")

    //println(lista.indexOf("shyv"))

    /*val lista = mutableSetOf("jhin", "shyv", "nunu", "will", "annie", "kayle", "jhin")

    lista.add("pyke")
    lista.remove("jhin")
*/

    val lista = mutableSetOf(
        Carro("X6", "BMW"),
        Carro("Gol", "VW"),
        Carro("i30", "Hyundai"),
        Carro("Civic", "Honda"),
        Carro("HRV", "Honda"),
        Carro("Onix", "Chevrolet"),

    )

    lista.add(Carro("Spin", "Chevrolet"))

    lista.forEach { carro ->
        println("Carro: ${carro.nome} | Marca: ${carro.marca}")
    }
}