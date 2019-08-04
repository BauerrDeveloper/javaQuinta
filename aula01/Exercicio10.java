package aula01;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Double totalDaConta= Double.parseDouble(JOptionPane.showInputDialog("Informe o total da conta: R$ "));
		
		Double felipe = totalDaConta / 3;
		int carlos = (int) (totalDaConta / 3);
		int andre = (int) (totalDaConta / 3);
		
		JOptionPane.showMessageDialog(null, "Felipe: R$ " + felipe
				+ "\n" +  "Carlos: R$ " + carlos + "\n" + "Andre: R$ " + andre);
		
		
	}

}
