package aula03;

public class Telefone {

	private String tipoDeTeclado;
	private String fabricante;
	
	//Construtor padrao (porque não tem parametros) é um metodo public e tem o mesmo nome da classe.
	public Telefone() {
		
	}
	
	
	//Construtor com parametros. Quando cria o objeto, obriga a entrar com informação.
	public Telefone(String tipoDeTeclado) {
		super();
		this.tipoDeTeclado = tipoDeTeclado;
	}

	
	//
	public Telefone(String tipoDeTeclado, String fabricante) {
		super();
		this.tipoDeTeclado = tipoDeTeclado;
		this.fabricante = fabricante;
	}


	public String getTipoDeTeclado() {
		return tipoDeTeclado;
	}

	public void setTipoDeTeclado(String tipoDeTeclado) {
		this.tipoDeTeclado = tipoDeTeclado;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Telefone [tipoDeTeclado=" + tipoDeTeclado + ", fabricante=" + fabricante + "]";
	}
	
	
	
}
