package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

//DRY - dont repeat yourself - nao repita codigos
//divisao de responsabilidades
// alto acoplamento e baixo acoplamento
// classes devem utilizar outras classes

class Musico (val instrumento: Instrumento) {
    fun tocar(){
        println("musico tocando")
        instrumento.sendoTocado()
    }
}

interface Instrumento{ //heranca e interface (contrato)
    abstract fun sendoTocado()
}

class Bateria : Instrumento { //dois tipos: bateria e instrumento

    override fun sendoTocado() {
        println("utilizando baquetas")
        println("para tocar a bateria")
    }

    fun ajustarBaquetas(){
        println("ajustando baquetas")
    }

    /*fun tocandoBateria(){
        println("utilizando baquetas")
        println("para tocar a bateria")
    }*/
}

class Violao : Instrumento { //dois tipos: violao e instrumento

    override fun sendoTocado() {
        println("utilizando cordas")
        println("para tocar o violao")
    }

    fun ajustarAfinacao(){
        println("ajustando afinacao")
    }

    /*fun sendoTocado(){
        println("utilizando cordas")
        println("para tocar o violao")
    }*/
}

class Guitarra : Instrumento {
    override fun sendoTocado() {
        println("utilizando cordas")
        println("para tocar a guitarra")
    }

}

fun main() {

    //tela 1
    val violao1 = Violao()
    val musico1 = Musico(violao1)
    musico1.tocar()
    println("-------------")

        //tela 2
    val violao2 = Violao()
    val musico2 = Musico(violao2)
    musico2.tocar()
    println("-------------")

    //tela 3
    val bateria1 = Bateria()
    val musico3 = Musico (bateria1) //bateria como instrumento (metodos de Instrumento)
    musico3.tocar()
    println("-------------")

    //tela 4
    val guitarra1 = Guitarra()
    val musico4 = Musico (guitarra1)
    musico4.tocar()
    println("-------------")
}