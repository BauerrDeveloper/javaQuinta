package aula01;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda note: "));
		Double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		
		int pesoNota1 = 1;
		int pesoNota2 = 2;
		int pesoNota3 = 3;
		
		JOptionPane.showMessageDialog(null, "A média (ponderada) do aluno é: " 
		+ ((pesoNota1 * nota1) + (pesoNota2 * nota2) + (pesoNota3 * nota3)) / (pesoNota1 + pesoNota2 + pesoNota3));

	}

}
