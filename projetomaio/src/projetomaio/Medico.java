package projetomaio;

/*
 * Generaliza��o/Especializa��o. Classe m�e/filha.
 */

public class Medico {
	
	private String nome;
	private String crm;	
	
	public Medico() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", crm=" + crm + "]";
	}

	
	
}
