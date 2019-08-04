package projetomaio;

public class CombustivelComum extends Combustivel implements CalculaCombustivel {

	private Double preco;
	
	public CombustivelComum() {
		
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "CombustivelComum [preco=" + preco + ", Cor()=" + getCor() + ", Octanagem()=" + getOctanagem()
				+ "]";
	}

	@Override
	public Double calculoPrecoCombustivel() {
		return 2.50 * 5;
	}
	
	
	
}
