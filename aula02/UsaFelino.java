package aula02;

import javax.swing.JOptionPane;

public class UsaFelino {

	public static void main(String[] args) {

		Felino felino1 = new Felino();
		felino1.setNome("Logan");
		felino1.idade = "10 meses";
		felino1.raca = "Vira-Lata";
		felino1.peso = 4.650;
		felino1.corPelo = "Amarelo";
		felino1.tamanhoPelo = "Curto";
		
		Felino felino2 = new Felino();
		//felino2.nome = "Titan";
		felino2.setNome("Titan");
		felino2.idade = "10 meses";
		felino2.raca = "Vira-Lata";
		felino2.peso = 4.300;
		felino2.corPelo = "Preto & Branco";
		felino2.tamanhoPelo = "Curto";

		JOptionPane.showMessageDialog(null,
				"Felino 1" + "\n" + "Nome : " + felino1.getNome() + "\n" + "Idade: " + felino1.idade + "\n" + "Raça: "
						+ felino1.raca + "\n" + "Peso (Kg): " + felino1.peso + "\n" + "Cor do Pelo: " + felino1.corPelo
						+ "\n" + "Tamanho do Pelo: " + felino1.tamanhoPelo
						+ "\n"
						+ "\n"
						+ "Felino 2" + "\n" + "Nome : " + felino2.getNome() + "\n" + "Idade: " + felino2.idade + "\n" + "Raça: "
						+ felino2.raca + "\n" + "Peso (Kg): " + felino2.peso + "\n" + "Cor do Pelo: " + felino2.corPelo
						+ "\n" + "Tamanho do Pelo: " + felino2.tamanhoPelo);

	}

}
