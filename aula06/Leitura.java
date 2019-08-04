package aula06;

import java.io.FileReader;
import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {

		try (Scanner arquivo = new Scanner(new FileReader("c:\\dadosJava\\pessoas.txt"))){
			while (arquivo.hasNext()) {
				String primeiroNome = arquivo.next();
				String ultimoNome = arquivo.next();
				int idade = arquivo.nextInt();
				System.out.println(primeiroNome + " " + ultimoNome + " " + idade + " anos de idade");				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
