package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

fun main(){

    val lista_lanches = listOf("burguer", "steak")
    val lista_entradas = listOf("chips", "coxinha")

    //val nova_lista = lista_lanches.union(lista_entradas)
    val nova_lista = lista_entradas + lista_lanches

    val lista_exclusao = listOf("chips")
    val lista_completa = nova_lista - lista_exclusao

    println(lista_completa)

    //println(nova_lista)

}