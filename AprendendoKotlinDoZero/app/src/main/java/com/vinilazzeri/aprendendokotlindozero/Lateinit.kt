package com.vinilazzeri.aprendendokotlindozero

class Produto{
    lateinit var descricao: String
}


fun main(){
    val produto = Produto()
    produto.descricao = "notebook"
    println(produto.descricao)
}