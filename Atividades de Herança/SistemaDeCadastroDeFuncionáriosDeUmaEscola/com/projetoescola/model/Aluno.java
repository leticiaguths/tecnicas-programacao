package com.projetoescola.model;

public class Aluno extends Pessoa {

    private String serie;

    public Aluno () {
        super();
        this.serie = "";
    }

    public Aluno (String nome, String email, String serie) {
        super(nome, email);
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

}