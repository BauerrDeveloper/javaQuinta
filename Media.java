package exercicio6;

import javax.swing.*;

public class Media {
	
public static void main(String[] args) {
		
		double valorDigitado;
		double soma = 0;
		int countNumero = 0;
		
		valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		do {
			if (valorDigitado % 2 == 0) {
				soma = (soma + valorDigitado);
				countNumero++;
			}
			
			valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		} while (valorDigitado >= 1);
		
		JOptionPane.showMessageDialog(null, "A soma dos números pares é: " + soma
				+ "\nA média dos números pares é: " + soma / countNumero
				+ "\nO total de números digitados foi: " + countNumero);
		
		
	}
}


