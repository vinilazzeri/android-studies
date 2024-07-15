package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste

/*class Motorista( val nome: String ){
    fun exibirDadosMotorista() = println("Motorista ${nome}")

    class  Caminhao(val nomeCaminhao: String){ //Classe aninhada (nested class)
        fun exibirDadosCaminhao() = println("Caminhao ${nomeCaminhao}")
    }

    inner class  Caminhao(val nomeCaminhao: String){ //classe interna (inner class)
        fun exibirDadosCaminhao() = println("Motorista ${nome} está no Caminhao ${nomeCaminhao}")
    }

}*/

//data class Perguntas (val pergunta: String, val respostaCerta: Int)

//getter (conseguir e recuperar) e setter (configurar)
/*
class Usuario(){

    var nome: String = ""
        get() {
            println("get: $field")
            return field.uppercase()
        }
        set(value) {
            field = "set: $value"
        }

    var idade: Int = 0
    var maiorIdade = false
        get() = idade >= 18

}
*/

class Usuario {
    fun salvarTelefones ( vararg telefones: String ){
        for (telefone in telefones){
            println("telefone: ${telefone}")
        }
    }
}


fun main(){

    val usuario = Usuario()
    usuario.salvarTelefones(
        "92 99999099",
        "82 82829103",
        "92 99999099",
        "82 82829103",
        "92 99999099",
        "82 82829103",
    )

    /*val pessoa = Pessoa()
    //varargs sempre no final
    pessoa.salvarTelefone(
        "92 99999099",
        "82 82829103",
        "92 99999099",
        "82 82829103",
        "92 99999099",
        "82 82829103",
        )*/

    /*val motorista = Motorista("Vini")
    val caminhao = motorista.Caminhao("Volvo")
    caminhao.exibirDadosCaminhao()

    val caminhao = Motorista.Caminhao("VOLVO") classe aninhada
    caminhao.exibirDadosCaminhao()

    val motorista = Motorista("Vini")
    motorista.exibirDadosMotorista()*/

    /*val pergunta1 = Perguntas("qual a pergunta?", 1)
    val pergunta2 = Perguntas("qual a pergunta?", 1)

    val (pergunta, resposta) = pergunta1

    println(pergunta)
    println(resposta)

    println(pergunta1 == pergunta2)*/

    /*val pessoa = Pessoa()
    pessoa.nome = "vini"

    println("nome: ${pessoa.nome}")*/

    /*
        val usuario = Usuario()
        usuario.nome = "kal"
        usuario.idade = 18

        println("nome: ${usuario.nome} | idade: ${usuario.idade} | maior idade: ${usuario.maiorIdade}")*/
}