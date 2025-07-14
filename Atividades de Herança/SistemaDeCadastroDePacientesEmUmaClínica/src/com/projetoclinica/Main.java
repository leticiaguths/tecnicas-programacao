package com.projetoclinica;
import java.util.Scanner;

import com.projetoclinica.model.Medico;
import com.projetoclinica.model.Paciente;
import com.projetoclinica.service.ClinicaService;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ClinicaService service = new ClinicaService();
		
		System.out.println("================================== Cadastro do Paciente ==================================\n");
		Paciente paciente = service.cadastrarPaciente(sc);

        System.out.println("\n=================================== Cadastro do Médico ===================================\n");
		Medico medico = service.cadastrarMedico(sc);

        System.out.println("\n==================================== Dados Cadastrados ===================================\n");
        service.mostrarDadosPaciente(paciente);
        System.out.println();
        service.mostrarDadosMedico(medico);

        sc.close();
	}

}