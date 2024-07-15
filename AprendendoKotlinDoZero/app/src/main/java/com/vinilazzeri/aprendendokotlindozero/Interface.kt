package com.vinilazzeri.aprendendokotlindozero

interface Presidenciavel{
    fun candidatarSe()
}

abstract class Pessoa{

    fun comer() = println("comer")

}

class DesenvolvedorAndroid : Pessoa(), Presidenciavel{
    fun noticiar() = println("noticiar")
    override fun candidatarSe() {
        println("participando do processo para se candidatar")
    }
}
class DesenvolvedorWeb : Pessoa(){
    fun programar() = println("programar")
}
class Jornalista : Pessoa(), Presidenciavel{
    fun noticiar() = println("noticiar")
    override fun candidatarSe() {
        println("participando do processo para se candidatar")
    }
}
class FuncionarioPublico : Pessoa(){}


fun main(){

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.candidatarSe()
    println("----------------")

    val jornalista = Jornalista()
    jornalista.candidatarSe()
    println("-----------------")
}