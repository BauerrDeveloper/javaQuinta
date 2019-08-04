package aula05;

public class CalculoMedia {

	private Double nota1, nota2, nota3, media;

	public CalculoMedia() {

	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double calcularMedia() {
		media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	public String situacaoAluno() {

		String situacao;

		if (media > 6) {
		situacao = "Aprovado.";
		} else if (media > 4 && media < 6) {
			situacao = "Verificação suplementar.";
		} else {
			situacao = "Reprovado.";
		}

		return situacao;
	}

}
