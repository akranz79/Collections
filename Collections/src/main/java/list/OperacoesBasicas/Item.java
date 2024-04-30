package main.java.list.OperacoesBasicas;

public class Item {

		//atributos
		private String nome;
		private double preco;
		private int quantidade;
		
		/**
		 * Construtor
		 * @param nome
		 * @param preco
		 * @param quantidade
		 */
		public Item(String nome, double preco, int quantidade) {
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
		}
		
		//Metodos Getters

		public String getNome() {
			return nome;
		}

		public double getPreco() {
			return preco;
		}

		public int getQuantidade() {
			return quantidade;
		}

		@Override
		public String toString() {
			return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
		}
		
		
	}

