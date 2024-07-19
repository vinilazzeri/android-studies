package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

//escopo de funcao é como uma funcao pode ser visualizada, podendo ser atalhos
//para codigos que escrevemos, facilitando nosso desenvolvimento.

class Pessoa {

    val nome = ""

}

var nome = "vini" //escopo global
fun executar(){

    //val nome = "executou novo nome ana" //escopo local

    nome = "executou novo nome ana"
}
fun main() {

    executar()
    println(nome)

}