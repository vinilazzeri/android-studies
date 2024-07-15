package com.vinilazzeri.aprendendokotlindozero

//abstraçao

//pessoa: cpf, altura, nome
//cachorro: raça, sexo, peso

class Jogador{

    //atributos
    var kart = ""
    var pneu = ""
    var planador = ""

    //metodos

    fun acelerar(aceleracao: Int = 0){
        println("acelerar na velocidade: $aceleracao")
    }

    fun retornarPoder(): String = "casco vermelho"
}

fun main(){

    val jogador = Jogador()
    jogador.kart = "kart do mario"
    jogador.acelerar(80)
    val poder = jogador.retornarPoder()
    println(poder )

}