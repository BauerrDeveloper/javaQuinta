package aula03;

public class UsaLacoFor {

	public static void main(String[] args) {

		int soma = 0;
		int somaPares = 0;
		int somaImpar = 0;

		for (int i = 0; i <= 100; i++) {
			soma += i;

			if (i % 2 == 0) {
				somaPares += i;
			} else {
				somaImpar += i;
			}

		}
		System.out.println("O resultado da soma de zero ate 100 é: " + soma);
		System.out.println("O resultado da soma dos numeros pares é: " + somaPares);
		System.out.println("O resultado da soma dos numeros impares é: " + somaImpar);
	}

}
