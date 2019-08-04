package aula06;

import javax.swing.JOptionPane;

public class UsaJogador {

	public static void main(String[] args) {

		Jogador objJogador1 = new Jogador();
		Jogador objJogador2 = new Jogador();

		objJogador1.setNome("Garrincha");
		objJogador1.setPosicao(7);
		objJogador1.setTime("Botafogo");
		objJogador1.setSalario(50000.00);
		
		objJogador2.setNome("Carlos");
		objJogador2.setPosicao(7);
		objJogador2.setTime("Vasco");
		objJogador2.setSalario(100000.00);//a informacao de varias estaticas é a ultima informacao setadas para todos os objetos
		
		
		System.out.println(objJogador1.toString());
		System.out.println(objJogador1.getSalario());
		System.out.println(objJogador2.toString());
		System.out.println(objJogador2.getSalario());
		
		

	}

}
