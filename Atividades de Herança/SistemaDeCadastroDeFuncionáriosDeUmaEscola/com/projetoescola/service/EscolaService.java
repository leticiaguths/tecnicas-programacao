package com.projetoescola.service;

import java.util.Scanner;

import com.projetoescola.model.Aluno;
import com.projetoescola.model.Professor;

public class EscolaService {

    public Aluno cadastrarAluno(Scanner sc) {
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Digite o email do aluno: ");
        aluno.setEmail(sc.nextLine());

        System.out.print("Digite a série do aluno: ");
        aluno.setSerie(sc.nextLine());

        return aluno;
    }

    public Professor cadastrarProfessor(Scanner sc) {
        Professor professor = new Professor();

        System.out.print("Digite o nome do professor: ");
        professor.setNome(sc.nextLine());

        System.out.print("Digite o email do professor: ");
        professor.setEmail(sc.nextLine());

        System.out.print("Digite a disciplina do professor: ");
        professor.setDisciplina(sc.nextLine());

        return professor;
    }

    public void mostrarDadosAluno(Aluno aluno) {
        System.out.println("Aluno: " + aluno.getNome() + " | Email: " + aluno.getEmail() + " | Série: " + aluno.getSerie());
    }

    public void mostrarDadosProfessor(Professor professor) {
        System.out.println("Professor: " + professor.getNome() + " | Email: " + professor.getEmail() + " | Disciplina: " + professor.getDisciplina());
    }

}