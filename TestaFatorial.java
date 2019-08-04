package fatorial;

import java.util.Scanner;

public class TestaFatorial {

	private static Scanner input;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero a ser fatorado: ");
		
		int n = scan.nextInt();
		int valor = n;
		int fatorial = n; 
		
		for( n = n; n > 1; n-- ) 
		{ 
		     fatorial *= (n - 1);
		}
		System.out.println( "O fatorial de " + valor + " � igual a " + fatorial + ".");
		}

	
}
