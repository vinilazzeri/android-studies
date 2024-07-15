package com.vinilazzeri.aulacomponenteslistagemcolecoes.teste;

public class Pessoa {

    private String nome = "";
    private int idade = 0;

    public void salvarTelefone(String... telefones){
        //System.out.println("telefone: " + telefone);
        for (String telefone: telefones){
            System.out.println(telefone);
        }

    }

    public String getNome() {
        System.out.println("get: " + nome);
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("set: " + nome);
        this.nome = nome;
    }
}
