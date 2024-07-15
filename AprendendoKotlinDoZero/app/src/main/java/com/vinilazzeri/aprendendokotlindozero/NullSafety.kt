package com.vinilazzeri.aprendendokotlindozero

class Carro {

    var cor = "vermelho"

    fun acelerar(){

    }

}

fun main() {

    var carro: Carro? = null
    carro = Carro()
    val cor = carro?.cor ?: "default color"
    /*if (carro != null){
        println(carro.cor)
    }*/
    println(cor)
}