package aula05;

public class VetorNotas {

	public static void main(String[] args) {
		
		Double notas[] = new Double[5];
		
		notas[0] = 8.9;
		notas[1] = 10.0;
		notas[2] = 6.78;
		notas[3] = 5.0;
		notas[4] = 10.0;
		Double soma = 0.00;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
			soma += notas[i];
		}
		
		System.out.println("A média é " + soma / 5);
	}
	
}

