package projetomaio;

public class Combustivel {

	private String cor;
	private String octanagem;
	
	public Combustivel() {
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getOctanagem() {
		return octanagem;
	}

	public void setOctanagem(String octanagem) {
		this.octanagem = octanagem;
	}

	@Override
	public String toString() {
		return "Combustivel [cor=" + cor + ", octanagem=" + octanagem + "]";
	}
	
	
}
