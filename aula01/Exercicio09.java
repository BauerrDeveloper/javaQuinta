package aula01;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {

		int camisetaPequena = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas pequenas: "));
		int camisetaMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas médias: "));
		int camisetaGrande = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas grandes: "));

		int totalCamisetasPequenas = camisetaPequena * 10;
		int totalCamisetasMedias = camisetaMedia * 12;
		int totalCamisetasGrandes = camisetaGrande * 15;
		int totalDaCompra = totalCamisetasPequenas + totalCamisetasMedias + totalCamisetasGrandes;

		JOptionPane.showMessageDialog(null,
				"Camisetas Pequenas: R$" + totalCamisetasPequenas + "\n" + "Camisetas Médias: R$" + totalCamisetasMedias
						+ "\n" + "Camisetas Grandes: R$" + totalCamisetasGrandes + "\n" + "\n"
						+ "O total da compra foi: R$" + totalDaCompra);

	}

}
