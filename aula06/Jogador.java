package aula06;

public class Jogador {

	private String nome;
	private int Posicao;
	private String time;
	private static Double salario;
	
	public Jogador () {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPosicao() {
		return Posicao;
	}

	public void setPosicao(int posicao) {
		this.Posicao = posicao;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public static Double getSalario() {
		return salario;
	}

	public static void setSalario(Double salario) {
		Jogador.salario = salario;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", Posicao=" + Posicao + ", time=" + time + "]";
	}
	
	
	
}
