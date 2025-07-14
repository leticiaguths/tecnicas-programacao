package com.projetoescola;
import java.util.Scanner;

import com.projetoescola.model.Aluno;
import com.projetoescola.model.Professor;
import com.projetoescola.service.EscolaService;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        EscolaService service = new EscolaService();

        System.out.println("===================================== Cadastro do Aluno =====================================\n");
        Aluno aluno = service.cadastrarAluno(sc);

        System.out.println("\n=================================== Cadastro do Professor ===================================\n");
        Professor professor = service.cadastrarProfessor(sc);

        System.out.println("\n===================================== Dados Cadastrados =====================================\n");
        service.mostrarDadosAluno(aluno);
        System.out.println();
        service.mostrarDadosProfessor(professor);

        sc.close();
    }

}