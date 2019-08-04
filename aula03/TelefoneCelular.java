package aula03;

public class TelefoneCelular extends Telefone {

	private String sistemaOperacional;

	public TelefoneCelular() {

	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	@Override
	public String toString() {
		return "TelefoneCelular [sistemaOperacional=" + sistemaOperacional + ", getTipoDeTeclado()="
				+ getTipoDeTeclado() + ", getFabricante()=" + getFabricante() + "]";
	}

}
