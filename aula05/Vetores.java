package aula05;

public class Vetores {

	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		String[] paises = {"Brasil", "EUA", "Espanha"};

		nomes[0] = "Maria";
		nomes[1] = "Paulo";
		nomes[2] = "Roberta";
		nomes[3] = "Moacir";
		nomes[4] = "Rubens";
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	
		for (int i = 0; i< paises.length; i++) {
			System.out.println(paises[i]);
		}
	
		
	}

}
