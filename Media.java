package exercicio6;

import javax.swing.*;

public class Media {
	
public static void main(String[] args) {
		
		double valorDigitado;
		double soma = 0;
		int countNumero = 0;
		
		valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero!"));
		do {
			if (valorDigitado % 2 == 0) {
				soma = (soma + valorDigitado);
				countNumero++;
			}
			
			valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero!"));
		} while (valorDigitado >= 1);
		
		JOptionPane.showMessageDialog(null, "A soma dos n�meros pares �: " + soma
				+ "\nA m�dia dos n�meros pares �: " + soma / countNumero
				+ "\nO total de n�meros digitados foi: " + countNumero);
		
		
	}
}


