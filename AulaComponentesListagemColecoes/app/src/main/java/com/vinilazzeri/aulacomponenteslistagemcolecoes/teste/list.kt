package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste


data class Cliente (
    val nome: String,
    val idade: Int
)

fun main(){

    /*val cliente1 = Cliente("marcelo", 51)
    val cliente2 = Cliente("marlo", 16)
    val cliente3 = Cliente("marc", 26)
    val cliente4 = Cliente("arcelo", 59)
    val cliente5 = Cliente("marcel", 32)*/

    //val listArray: List<String> = listOf("vini", "cius")
    //val listArray: List<String> = listOf("vini", "cius")
    //val listArray: List<String> = listOf("vini", "cius")

    val lista_clientes = mutableListOf(
        /*cliente1,
        cliente2,
        cliente3,
        cliente4,
        cliente5*/

        Cliente("marcelo", 51),
        Cliente("marcel", 31),
        Cliente("celo", 19),
        Cliente("marc", 23),
        Cliente("mar", 50),
        Cliente("marlo", 42)
    )

    /*listArray[0] = "vini alterado"

    val nova_lista = listOf("ola", "hello")
    listArray.addAll(nova_lista)
    listArray.add("marciano")
    //listArray.remove("vini alterado")
    listArray.removeAt(0)*/

    lista_clientes.forEach { cliente ->
        println("${cliente.nome} | ${cliente.idade}")
    }
}