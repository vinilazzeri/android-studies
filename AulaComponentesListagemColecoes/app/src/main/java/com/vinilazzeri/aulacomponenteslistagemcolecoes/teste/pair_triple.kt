package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

fun main() {

    //val localizacao = Pair(10, 20)
    //val localizacao = 10 to 20

    val localizacao = Triple(10, 20, "localizacao")

    println(localizacao.first)
    println(localizacao.second)
    println(localizacao.third)

}