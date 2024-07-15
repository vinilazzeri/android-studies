package com.vinilazzeri.aprendendokotlindozero

fun main(){

    /*val nota1 = 8
    val nota2 = 3
    val condicao = ((nota1 + nota2) / 2) >= 7

    if (condicao == true){
        println("aprovado")
    }else{
        println("reprovado")
    }*/

    //val opcao = 7

   /* if (opcao == 1){
        println("cartao de credito")
    } else if (opcao == 2){
        println("extrato bancario")
    } else if (opcao == 3){
        println("saldo")
    } else{
        println("nada foi selecionado")
    }*/

    /*if (opcao in 1..3){
        println("1 ate 3")
    } else if (opcao in 4..8){
        println("4 ate 8")
    } else {
        println("nao esta no intervalo")
    }*/

    val opcao = 4
    when(opcao){
        1 -> println("cartao de credito")
        2 -> println("extrato bancario")
        in 3..6 -> println("saldo")
        else -> println("nda")
    }
}