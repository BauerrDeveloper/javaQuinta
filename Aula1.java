package exercicios1;

import java.util.Scanner;

public class Aula1 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		double number1 = 0.00;
		int number2;
		double sum = 0.00d;
		
		System.out.println("Digite um numero");
		number1 = input.nextInt();
		
		System.out.println("Digite outro numero");
		number2 = input.nextInt();
		
		sum = number1 / number2 ;
		System.out.println("O resultado é: " + sum);
		
		
		
	}

}
