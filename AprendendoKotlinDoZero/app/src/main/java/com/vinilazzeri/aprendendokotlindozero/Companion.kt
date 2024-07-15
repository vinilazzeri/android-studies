package com.vinilazzeri.aprendendokotlindozero

class Car(var modelo: String = "", var velocidade: Int = 0){

    fun exibirInformacoes(){
        println("MODELO DO CARRO: $modelo | VEL: $velocidade")
    }

    companion object{
       const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirMensagemDeAviso(){
            println("Velocidade máxima permitida: ${Car.VELOCIDADE_MAX_PERMITIDA}")
        }
    }
}

class Usuario{
    companion object{
        fun verificarUsuarioLogado(): Boolean{
            return true
        }
    }
}


fun main(){

    val returno = Usuario.verificarUsuarioLogado()
    println("usuario esta logado? $returno")

    /*Car.exibirMensagemDeAviso()
    val fusca = Car("Fusca", 68)
    fusca.exibirInformacoes()

    val ferrari = Car("Ferrari", 280)
    ferrari.exibirInformacoes()

    println("PI = ${Math.PI}")*/
}