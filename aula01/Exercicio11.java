package aula01;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		Double queijo = 50.0;
		Double presunto = 50.0;
		Double hamburguer = 100.0;
		
		Double totalSanduiches = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de sanduiches a fazer: "));

		Double totalQueijo = totalSanduiches * queijo;
		Double totalPresunto = totalSanduiches * presunto;
		Double totalHamburguer = totalSanduiches * hamburguer;

		JOptionPane.showMessageDialog(null,
				"Quantidade de queijo(kg) a usar: " + ((totalQueijo * 2) / 1000) + "\n" + "Quantidade de presunto(kg) a usar: "
						+ (totalPresunto  / 1000) + "\n" + "Quantidade de hamburguers(kg): " + totalHamburguer / 1000);

	}

}
