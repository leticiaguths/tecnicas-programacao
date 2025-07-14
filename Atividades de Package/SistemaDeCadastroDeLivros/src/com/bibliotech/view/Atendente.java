package com.bibliotech.view;

import java.util.Scanner;

import com.bibliotech.model.Livro;

public class Atendente {
	Scanner sc;

	public Atendente() {
		sc = new Scanner(System.in);
	}
	
	public int menuPrincipal() {
		System.out.println("\n=================== Biblioteca Velaris ===================\n");

		System.out.println("1 - Cadastrar um livro \n2 - Listar todos os livros \n3 - Remover livro por título \n4 - Buscar livro por título \n5 - Editar dados de um livro \n6 - Mostrar total de livros cadastrados \n7 - Sair do sistema");
		int menu = sc.nextInt();
		sc.nextLine();
		System.out.println("\n==========================================================");
		return menu;
	}
	
	//CADASTRAR LIVRO---------------------------------------------------------------
	
	public String cadastrarTitulo() {
		System.out.print("\nDigite o título do livro a ser cadastrado: ");
		String titulo = sc.nextLine();
		return titulo;
	}
	
	public String cadastrarAutor() {
		System.out.print("\nDigite o autor do livro a ser cadastrado: ");
		String autor = sc.nextLine();
		return autor;
	}
	
	public double cadastrarPreco() {
		System.out.print("\nDigite o preço do livro a ser cadastrado: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		return preco;
	}
	
	public int cadastrarQuantidade() {
		System.out.print("\nDigite a quantidade do livro a ser cadastrado: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		return quantidade;
	}
	
	public String cadastrarEditora() {
		System.out.print("\nDigite a editora do livro a ser cadastrado: ");
		String editora = sc.nextLine();
		return editora;
	}
	
	//LISTAR LIVRO ---------------------------------------------------------------
	
	public void visualizar(Livro livro) {
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Preço: R$" + livro.getPreco());
		System.out.println("Quantidade: " + livro.getQuantidade());
		System.out.println("Editora: " + livro.getEditora());
		System.out.println("----------------------------------------------------------");
	}
		
	//REMOVER LIVRO ---------------------------------------------------------------

	public String removerLivro() {
		System.out.println("\nDigite o título do livro a ser removido: ");
		String remover = sc.nextLine();
		return remover;
	}
	
	public void visualizarLivroRemovido(String titulo) {
		System.out.println("\nO livro '" + titulo + "' foi removido.");
	}
	
	public void mensagemNaoEncontrado() {
		System.out.println("\nLivro não encontrado.");
	}
	
	//BUSCAR LIVRO ---------------------------------------------------------------

	public String buscarLivro() {
		System.out.println("\nDigite o título do livro a ser pesquisado: ");
		String busca = sc.nextLine();
		return busca;
	}
	
	public void visualizarLivro(String busca) {
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Preço: R$" + livro.getPreco());
		System.out.println("Quantidade: " + livro.getQuantidade());
		System.out.println("Editora: " + livro.getEditora());
		System.out.println("----------------------------------------------------------");
	}
	
	//EDITAR LIVRO ---------------------------------------------------------------
	
	/*
	 
	 public int editarLivro() {
		System.out.println("====================== Selecione o que você deseja editar =======================\n");
	    System.out.println("1- Título \n2- Autor \n3- Preço \n4- Quantidade \n5- Editora");
	    int editar = sc.nextInt();
	    return editar;
	}
	
	public String editarTitulo() {
		System.out.println("\nDigite o novo título do livro: ");
		String novo = sc.nextLine();
			
			if (novo.trim().isEmpty()){
				break;
			} else {
				titulo = novo;
			}
			
		System.out.println("\n=============================================================================="); 
		System.out.println();
        System.out.println("            A orientação '" + edicao + "' foi editada para '" + nome[h] + "'!");
	}
	
	public String editarAutor() {
		
	}
	
	public double editarPreco() {
		
	}
	
	public int editarQuantidade() {
		
	}
	
	public String editarEditora() {
		
	}
	
	*/
	
	//GET E SET ---------------------------------------------------------------

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}