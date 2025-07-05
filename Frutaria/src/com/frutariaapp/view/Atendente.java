package com.frutariaapp.view;

import java.util.List;

import java.util.Scanner;

import com.frutariaapp.model.Fruta;
import com.frutariaapp.service.Estoque;

public class Atendente {

	private Scanner sc;
	
	public Atendente() {
		sc = new Scanner(System.in);
	}
	
	public int menuPrincipal() {
		System.out.println("=================== Frutaria Bananal ===================\n");
		System.out.println("1 - Cadastrar Fruta \n2 - Listar Frutas \n3 - Remover Fruta \n4 - Sair da Frutaria");
		int menu = sc.nextInt();
		System.out.println("\n========================================================");
		sc.nextLine();
		return menu;	
	}
	
	//CADASTRAR ---------------------------------------------------------------
	
	public String cadastrarNome() {
		System.out.print("\nDigite o nome da fruta: ");
		String nome = sc.nextLine();
		return nome;
	}
	
	public double cadastrarPreco() {
		System.out.print("\nDigite o preço da fruta: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		return preco;
	}
	
	public int cadastrarQuantidade() {
		System.out.print("\nDigite a quantidade da fruta: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		return quantidade;
	}
	
	//LISTAR ---------------------------------------------------------------
	
	public void visualizar(Fruta fruta) {
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: R$" + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("----------------------------------------------------------\n");
	}
	
	//REMOVER ---------------------------------------------------------------
	
	public String removerFruta() {
		System.out.print("\nDigite o nome da fruta a ser removida: ");
		String remover = sc.nextLine();
		return remover;
	}
	
	public void visualizarFrutaRemovida(String nome) {
		System.out.println("\nA fruta '" + nome + "' foi removida.\n");
	}
	
	public void mensagemNaoEncontrada() {
		System.out.println("\nFruta não encontrada.\n");
	}
	
	//GET E SET ---------------------------------------------------------------
	
	public Scanner getSc() {
		return sc;
	}
	
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}