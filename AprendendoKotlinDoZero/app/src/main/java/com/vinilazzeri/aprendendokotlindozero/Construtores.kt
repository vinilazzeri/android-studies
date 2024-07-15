package com.vinilazzeri.aprendendokotlindozero

//construtor primario (metodo tradicional)
/*class User constructor(nomeP: String, sobrenomeP:String){
    var nome:String = ""
    var sobrenome:String = ""

    init {//inicializar algo antes de ter um usuario
        this.nome = nomeP
        this.sobrenome = sobrenomeP
        println("objeto inicializado")
        println("$nome $sobrenome")
    }
}*/

//segundo metodo
//construtor primario
/*
class User(var nome: String = "", var sobrenome: String = ""){

    init {
        println("objeto inicialiado")
        println("$nome $sobrenome")
    }
    constructor(nome : String): this(nome, ""){//construtor secundario
        println("construtor secundario")
    }
}



fun main(){

    val usuario = User("vini")

}*/
