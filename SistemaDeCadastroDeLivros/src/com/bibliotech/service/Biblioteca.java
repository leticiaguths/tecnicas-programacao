package com.bibliotech.service;

import java.util.List;
import java.util.ArrayList;

import com.bibliotech.model.Livro;
import com.bibliotech.view.Atendente;

public class Biblioteca {
	
	private List<Livro> bibliotecaLivro;

	public Biblioteca() {
		bibliotecaLivro = new ArrayList<>();
	}
	
	public void gerenciarBiblioteca(int opcaoMenu, Atendente atendente) {
		
		switch(opcaoMenu) {
		
			case 1 -> {
				
				String titulo = atendente.cadastrarTitulo();
				String autor = atendente.cadastrarAutor();
				double preco = atendente.cadastrarPreco();
				int quantidade = atendente.cadastrarQuantidade();
				String editora = atendente.cadastrarEditora();
				
				Livro livro = new Livro(titulo, autor, preco, quantidade, editora);
				bibliotecaLivro.add(livro);
				System.out.println("\n==========================================================");
			}
				
			case 2 -> {
				System.out.println("\n===================== Lista de Livros ====================\n");
				System.out.println("----------------------------------------------------------");
				for (Livro livro : bibliotecaLivro) {
					atendente.visualizar(livro);
				}
					
				if(bibliotecaLivro.isEmpty()) {
					System.out.println("\nNenhum livro cadastrado.");
				}
				
			}
			
			case 3 -> {
				String titulo = atendente.removerLivro();
				boolean removido = false;

				for (int indice = 0; indice < bibliotecaLivro.size(); indice++) {
					if (bibliotecaLivro.get(indice).getTitulo().equalsIgnoreCase(titulo)) {
						bibliotecaLivro.remove(indice);
						removido = true;
						break;
					}
				}

				if (removido) {
					atendente.visualizarLivroRemovido(titulo);
				} else {
					atendente.mensagemNaoEncontrado();
				}
			}
			
			case 4 -> {
				String busca = atendente.buscarLivro();
				boolean pesquisado = false;

				if (pesquisado) {
					atendente.visualizarLivro(busca);
				} else {
					atendente.mensagemNaoEncontrado();
				}
			}
			
			case 5 -> {
				
			}
			
			case 6 -> {
				
			}
			
			case 7 -> {
				System.out.println("\nObrigado por confiar na Biblioteca Velaris. Volte sempre.");
			}
			
			default -> {
				System.out.println("\nNúmero inválido. Tente novamente.");
			}
		
		}
		
	}	
	
	public List<Livro> getBibliotecaLivro(){
		return bibliotecaLivro;
	}
	
	public void setBibliotecaLivro(List<Livro> bibliotecaLivro){
		this.bibliotecaLivro = bibliotecaLivro;
	}

}