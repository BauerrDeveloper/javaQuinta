package projetomaio;

/**
 * Este é um comentário para javaDoc.
 * @version 1.0
 * 
 * @author Maris
 *
 */

public class Financeiro {

	/*
	 * Estes são atributos de classe
	 * São as caracteristicas pertencentes a cada objeto 
	 * desta classe.
	 * 
	 */
	private String produto;
	private int quantidade;
	private Double valor;
	
	
	
	
	//Este é um construtor padrão.
		public Financeiro() {
					
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void mostrarDados(Financeiro obj1) {
		System.out.println("Nome Produto: "+ obj1.getProduto());
		System.out.println("Quantidade Produto: " + obj1.getQuantidade());
		System.out.println("Valor Produto: " + obj1.getValor());		
	}
	
		
}
