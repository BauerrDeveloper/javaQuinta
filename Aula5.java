package exercicioaula5;


import java.util.Scanner;

import javax.swing.JOptionPane;;

public class Aula5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
//		Scanner input = new Scanner(System.in);
		
		int count;
		int candidato01 = 0;
		int candidato02 = 0;
		int candidato03 = 0;
		int candidato04 = 0;
		int votoNulo = 0;
		int votoBranco = 0;
		

		
		
/**		System.out.println(">>> SUPER HER�IS ANOS 90 <<<");
		System.out.println();
		System.out.println("   1 - Jaspion");
		System.out.println("   2 - Jiraya");
		System.out.println("   3 - Black Kamen Rider");
		System.out.println("   4 - Jiban");
		System.out.println("   5 - Voto Branco");
		System.out.println("   6 - Voto Nulo");
		System.out.println();
*/		
		
		do {
			JOptionPane.showMessageDialog(null, ">>> SUPER HEROIS ANOS 90 <<<"
					+ "\n   1 - Jaspion"
					+ "\n   2 - Jiraya"
					+ "\n   3 - Black Kamen Rider"
					+ "\n   4 - Jiban"
					+ "\n   5 - Voto Branco"
					+ "\n   6 - Voto Nulo"
					+ "\n   0 - Ver resultados");
			count = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero!"));
			
//			System.out.println("Qual seu super her�i favorito? ");
//			count = input.nextInt();
			
			
			switch (count) {
			case 1:
				candidato01 = (candidato01 + 1);
				count++;
				break;
			case 2:
				candidato02 = (candidato02 + 1);
				count++;
				break;
			case 3:
				candidato03 = (candidato03 + 1);
				count++;
				break;
			case 4:
				candidato04 = (candidato04 + 1);
				count++;
				break;
			case 5:
				votoBranco = (votoBranco + 1);
				count++;
				break;
			case 6:
				votoNulo = (votoNulo + 1);
				count++;
				break;
			case 0: 
				JOptionPane.showMessageDialog(null, "O total de votos no Jaspion foi: " + candidato01
						+ "\nO total de votos no Jiraya foi: " + candidato02
						+ "\nO total de votos no Black Kamen Rider foi: " + candidato03
						+ "\nO total de votos no Jiban foi: " + candidato04
						+ "\nO total de votos em branco foi: " + votoBranco
						+ "\nO total de votos nulos foi: " + votoNulo);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida!!!");
//				System.out.println("Op��o inv�lida!!!");
							
			}
			
		} while (count >= 1);
		
		
/**		System.out.println();
		System.out.println("O total de votos no Jaspion foi: " + candidato01);
		System.out.println("O total de votos no Jiraya foi: " + candidato02);
		System.out.println("O total de votos no Black Kamen Rider foi: " + candidato03);
		System.out.println("O total de votos no Jiban foi: " + candidato04);
		System.out.println("O total de votos em branco foi: " + votoBranco);
		System.out.println("O total de votos nulos foi: " + votoNulo);
*/

	}

}