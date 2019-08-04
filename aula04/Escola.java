package aula04;

public class Escola {

	private String nomeEscola;
	private String enderecoEscola;
	private String telefoneEscola;
	
	public Escola() {
		
	}
	
	
	public Escola(String nomeEscola, String enderecoEscola, String telefoneEscola) {
		super();
		this.nomeEscola = nomeEscola;
		this.enderecoEscola = enderecoEscola;
		this.telefoneEscola = telefoneEscola;
	}

	public Escola(String nomeEscola, String enderecoEscola) {
		super();
		this.nomeEscola = nomeEscola;
		this.enderecoEscola = enderecoEscola;
		
	}
	
	public Escola(String nomeEscola) {
		super();
		this.nomeEscola = nomeEscola;
		
		
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(String enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public String getTelefoneEscola() {
		return telefoneEscola;
	}

	public void setTelefoneEscola(String telefoneEscola) {
		this.telefoneEscola = telefoneEscola;
	}
	
	
	
}
