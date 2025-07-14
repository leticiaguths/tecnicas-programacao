package com.projetoclinica.service;

import java.util.Scanner;

import com.projetoclinica.model.Medico;
import com.projetoclinica.model.Paciente;

public class ClinicaService {
	
	public Paciente cadastrarPaciente(Scanner sc) {
		Paciente paciente = new Paciente();

        System.out.print("Digite o nome do paciente: ");
        paciente.setNome(sc.nextLine());

        System.out.print("\nDigite o telefone do paciente: ");
        paciente.setTelefone(sc.nextLine());

        System.out.print("\nDigite o plano de saúde do paciente: ");
        paciente.setPlanoSaude(sc.nextLine());

        return paciente;
    }

    public Medico cadastrarMedico(Scanner sc) {
    	Medico medico = new Medico();

        System.out.print("Digite o nome do médico: ");
        medico.setNome(sc.nextLine());

        System.out.print("\nDigite o telefone do médico: ");
        medico.setTelefone(sc.nextLine());

        System.out.print("\nDigite a especialidade do médico: ");
        medico.setEspecialidade(sc.nextLine());

        return medico;
    }
    
    public void mostrarDadosPaciente(Paciente paciente) {
        System.out.println("Paciente: " + paciente.getNome() + " | Telefone: " + paciente.getTelefone() + " | Plano de Saúde: " + paciente.getPlanoSaude());
    }
    
    public void mostrarDadosMedico(Medico medico) {
        System.out.println("Medico: " + medico.getNome() + " | Telefone: " + medico.getTelefone() + " | Especialidade: " + medico.getEspecialidade());
    }

}