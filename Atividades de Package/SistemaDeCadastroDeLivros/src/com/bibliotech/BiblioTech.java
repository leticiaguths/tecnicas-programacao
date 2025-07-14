package com.bibliotech;

import com.bibliotech.view.Atendente;
import com.bibliotech.service.Biblioteca;

public class BiblioTech {

	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Biblioteca biblioteca = new Biblioteca();
		int opcaoMenu = 0;
		
		do {
		opcaoMenu = atendente.menuPrincipal();
		biblioteca.gerenciarBiblioteca(opcaoMenu, atendente);
		} while (opcaoMenu != 7);
		
		
	}
}