package projetomaio;

public class CombustivelAditivado extends Combustivel implements CalculaCombustivel {
	
	private Double precoA;

	public CombustivelAditivado() {
		
		
		
	}

	public Double getPrecoA() {
		return precoA;
	}

	public void setPrecoA(Double precoA) {
		this.precoA = precoA;
	}

	@Override
	public String toString() {
		return "CombustivelAditivado [precoA=" + precoA + ", Cor()=" + getCor() + ", Octanagem()="
				+ getOctanagem() + "]";
	}

	@Override
	public Double calculoPrecoCombustivel() {
			return 2.89 * 10;
	}
	
	

}
