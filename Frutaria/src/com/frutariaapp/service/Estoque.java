package com.frutariaapp.service;

import java.util.List;
import java.util.ArrayList;

import com.frutariaapp.model.Fruta;
import com.frutariaapp.view.Atendente;

public class Estoque {
	
	private List<Fruta> estoqueFruta;
	
	public Estoque() {
		estoqueFruta = new ArrayList<>();
	}
	
	public void gerenciarEstoque(int opcaoMenu, Atendente atendente) {
		
		switch(opcaoMenu) {
		
			case 1 -> {
				String nome = atendente.cadastrarNome();
				double preco = atendente.cadastrarPreco();
				int quantidade = atendente.cadastrarQuantidade();
				Fruta fruta = new Fruta(nome, preco, quantidade);
				estoqueFruta.add(fruta);
				System.out.println("\n========================================================");
			}
				
			case 2 -> {
				System.out.println("\n===================== Lista de Frutas ====================\n");
				System.out.println("----------------------------------------------------------");
				for (Fruta fruta : estoqueFruta) {
					atendente.visualizar(fruta);
				}
					
				if(estoqueFruta.isEmpty()) {
					System.out.println("\nNenhuma fruta cadastrada.\n");
				}
			}
			
			case 3 -> {
				String nome = atendente.removerFruta();
				boolean removido = false;

				for (int indice = 0; indice < estoqueFruta.size(); indice++) {
					if (estoqueFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
						estoqueFruta.remove(indice);
						removido = true;
						break;
					}
				}

				if (removido) {
					atendente.visualizarFrutaRemovida(nome);
				} else {
					atendente.mensagemNaoEncontrada();
				}			
			}
			
			case 4 -> {
				System.out.println("\nObrigado por confiar na Frutaria Bananal. Volte sempre.");
			}
			
			default -> {
				System.out.println("\nNúmero inválido. Tente novamente.");
			}
		
		}
		
	}
	
	public List<Fruta> getEstoqueFruta(){
		return estoqueFruta;
	}
	
	public void setEstoqueFruta(List<Fruta> estoqueFruta){
		this.estoqueFruta = estoqueFruta;
	}

}