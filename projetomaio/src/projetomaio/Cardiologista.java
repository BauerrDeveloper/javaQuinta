package projetomaio;

public class Cardiologista extends Medico implements Medicos {

	private int quantidadeOperacoes;
	
	
	public Cardiologista() {
		
	}


	public int getQuantidadeOperacoes() {
		return quantidadeOperacoes;
	}


	public void setQuantidadeOperacoes(int quantidadeOperacoes) {
		this.quantidadeOperacoes = quantidadeOperacoes;
	}


	@Override
	public Double calculaSalario() throws Exception {
		return 2500.00 * 9;
	}


	@Override
	public int geraIdade() throws Exception {
		return 3 * 4 + 365;
	}


	@Override
	public void escreveConsulta() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
