package aula01;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Double temperaturaCelsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: "));
		
		Double temperaturaFahrenheit = (1.8 * temperaturaCelsius) + 32;
		
		JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + temperaturaFahrenheit);
		

	}

}
