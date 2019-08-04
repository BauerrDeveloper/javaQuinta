package aula04;

public class Aviao {

	private int codigo;
	private String nomeAviao;

	// metodo construtor padrao. Sem ele não conseguimos criar objetos
	public Aviao() {

	}

	// metodo construtor que não é o padrão. Obrigado na criação do objeto de setar informação.
	public Aviao(int codigo, String nomeAviao) {
		super();
		this.codigo = codigo;
		this.nomeAviao = nomeAviao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeAviao() {
		return nomeAviao;
	}

	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}

}
