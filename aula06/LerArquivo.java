package aula06;

import java.io.FileReader;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) {

		Scanner arquivo = null;
		try {
			FileReader in = new FileReader("c:\\dadosJava\\numeros.txt");
			arquivo = new Scanner(in);
			int soma = 0;
			for (int i = 0; i < 100; i++) {
				soma += arquivo.nextInt();
			}
			System.out.println("Média: " + soma / 100f);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			arquivo.close();
		}

	}

}
