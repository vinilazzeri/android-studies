package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste


data class Produto(
    var nome: String,
    var preco: Double
){
    fun desativar(){
        println("Produto $$nome com preço: $preco foi desativado")
    }
}

fun salvarProduto(produto: Produto){

}

class AlertaMensagem{

    fun configurarTitulo(titulo: String) = println(titulo)
    fun configurarDescricao(descricao: String) = println(descricao)
    fun configurarCancelar() = println("acao de cancelar")
    fun configurarConfirmar() = println("acao de confirmar")
}
fun main() {

    val alertaMensagem = AlertaMensagem()
    /*alertaMensagem.configurarTitulo("confirmar salvar?")
    alertaMensagem.configurarDescricao("vc tem certeza...?")
    alertaMensagem.configurarCancelar()
    alertaMensagem.configurarConfirmar()*/

    /*alertaMensagem.apply {
        configurarTitulo("confirmar salvar?")
        configurarDescricao("vc tem certeza...?")
        configurarCancelar()
        configurarConfirmar()
    }*/

    val lista = listOf("ana", "banana", "pedro")

    lista
        .map { it.uppercase() }
        .also { println(it) }

    //var produto: Produto? = null
    //usuario é que pode escolher ou nao um produto

    //produto = Produto("notebook", 1200.00)

    /*produto?.let {
        salvarProduto(it)
    }*/

    //produto?.run {desativar()}

    /*val novo_objeto = with(produto){
        desativar()
        this
    }*/

    /*if (produto != null){
        produto.preco = 1100.00
        salvarProduto(produto)

    }*/

   /* val novo_produto = produto?.let {
        //produto.preco = 1100.00
        it.preco = 1100.00
        //salvarProduto(produto)
        it
    }*/

    /*produto?.let {
        it.preco = 1100.00
        salvarProduto(it)
    }

    println(produto?.nome)
    println(produto?.preco)*/

}