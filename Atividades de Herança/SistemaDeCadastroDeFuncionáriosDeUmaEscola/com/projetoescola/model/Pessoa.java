package com.projetoescola.model;

public class Pessoa {

    protected String nome;
    protected String email;

    public Pessoa() {
        this.nome = "";
        this.email = "";
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}