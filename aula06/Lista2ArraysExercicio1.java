package aula06;

import java.util.Arrays;

public class Lista2ArraysExercicio1 {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int[] numeros2 = new int[11];
		int[] numeros3 = new int[10];
		

		//Exercicio A
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = 10 - i;

		}

		System.out.println(Arrays.toString(numeros));
		
		//Exercicio B

		for (int i = 0; i < numeros2.length; i++) {

			numeros2[i] = i * i;

		}
		
		System.out.println(Arrays.toString(numeros2));

	
	
	//Exercio C

	for (int i = 0; i < numeros3.length; i++) {
		if (i <= 4) {
			numeros3[i] = i + 1;
			numeros3[i + 4] = i * 10;
		} else if (i == 5) {
			numeros3[numeros3.length - 1] = 10 * 5;
		}
	}
	
	System.out.println(Arrays.toString(numeros3));

	}
	
}
