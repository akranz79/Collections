package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

		// TODO Auto-generated constructor stub
		private List<Item> carrinhoItem;

		/**
		 * @param carrinhoItem
		 */
		public CarrinhoDeCompras() {
			this.carrinhoItem = new ArrayList<>();
		}
		
		public void adicionarItem(String nome, double preco, int quantidade) {
			carrinhoItem.add(new Item(nome,preco,quantidade));		}


		public void removerItem(String nome) {
		    List<Item> itensParaRemover = new ArrayList<>();
		    if (!carrinhoItem.isEmpty()) {
		        for (Item t : carrinhoItem) {
		            if (t.getNome() != null && t.getNome().equalsIgnoreCase(nome)) {
		                itensParaRemover.add(t);
		            }
		        }
		        carrinhoItem.removeAll(itensParaRemover);
		    } else {
		        System.out.println("A lista está vazia!");
		    }
		}
		
		//Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
		public double calcularValorTotal() {
		    double valorTotal = 0.0;
		    for (Item item : carrinhoItem) {
		        valorTotal += item.getPreco() * item.getQuantidade();
		    }
		    return valorTotal;
		}
		
		public void exibirItens() {
		    if (carrinhoItem.isEmpty()) {
		        System.out.println("O carrinho está vazio!");
		    } else {
		        System.out.println("Itens no carrinho:");
		        for (Item item : carrinhoItem) {
		            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
		        }
		    }
		}

		
		public static void main(String[] args) {
			CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
			
			carrinhoDeCompras.adicionarItem("Geladeira", 4590, 2);
			carrinhoDeCompras.adicionarItem("Sofá", 5210, 1);
			carrinhoDeCompras.adicionarItem("Televisor", 1270, 3);
			carrinhoDeCompras.removerItem("Geladeira");
			carrinhoDeCompras.exibirItens();
			
			System.out.println("Exibindo total do carrinho R$ "+ carrinhoDeCompras.calcularValorTotal());
			
			
		}
		

	}
		
	
	

