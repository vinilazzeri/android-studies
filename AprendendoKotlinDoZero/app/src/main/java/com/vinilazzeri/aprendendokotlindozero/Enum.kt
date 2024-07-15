package com.vinilazzeri.aprendendokotlindozero

//aguardando_aprovacao, pedido_realizado, pagamento_confirmado
//pedido_enviado, pedido_entregue

enum class StatusPedido{
    AGUARDANDO_APROVACAO,
    PEDIDO_REALIZADO,
    PAGAMENTO_CONFIRMADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE
}

class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {
}

fun main(){
    // tela de compras
    val pedido = Pedido(125.90, "camiseta, livro")

    //pagamento com cartao
    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    //transportadora
    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO
    println("StatusPedido: ${StatusPedido.PEDIDO_ENVIADO.ordinal}")
    //historico de compras
    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
        println("pedido foi realizado")
    }else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO){
        println("pagamento confirmado")
    }else if(pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO){
        println("pedido enviado")
    }

}