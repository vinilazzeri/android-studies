package com.vinilazzeri.aprendendokotlindozero

abstract class Animal{ //classe pai, super classe & abstrata
    var cor = ""
    var tamanho = ""
    var peso = 0.0

    open fun correr(){
        print("correndo como um ")
    }

    open fun dormir(){
        print("dormindo como um ")
    }
}

class Cao : Animal(){//classe filha -  classe concreta

    fun latir() = println("latindo")
    override fun correr(){
        super.correr()
        println("cao de 4 patas")
    }
}

class Passaro : Animal(){ //classe filha - classe concreta

    fun voar() = println("voando")
    override fun dormir() {
        super.dormir()
        println("passarinho")
    }
}

fun main(){
    /*val cao = Cao()
    cao.peso = 37.5
    cao.tamanho = "grande"
    cao.cor = "capa preta"
    cao.correr()

    val passaro = Passaro()
    passaro.dormir()*/

    val cao = Cao()
    cao.correr()
}