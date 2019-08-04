package aula05;

public class CalculoImc {
	
	Double altura, peso, imc;

	public CalculoImc() {
		
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Double calcularImc() {
		imc = peso / (altura * altura);
		return imc;
	}
	
	public String situacaoImc () {
		
		String situacao;
		
		if (imc < 18.5) {
			situacao = "Você está abaixo do peso ideal.";
		} else if (imc >= 18.5 && imc <= 24.9) {
			situacao = "Você está no seu peso ideal!";
		} else if (imc >= 25 && imc <= 29.9){
			situacao = "Você está com sobrepeso.";
		} else if (imc >= 30 && imc <= 34.9 ){
			situacao = "Obesidade grau I";
		} else if (imc >= 35 && imc <= 39.9) {
			situacao = "Obesidade grau II";
		} else {
			situacao = "Obesidade mórbida";
		}

		return situacao;
	}
}
