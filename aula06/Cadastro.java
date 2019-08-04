package aula06;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		try (PrintWriter arquivo = new PrintWriter(new FileWriter("c:\\dadosJava\\pessoas.txt", true))) {
			arquivo.println();
			System.out.print("Primeiro nome: ");
			arquivo.print(teclado.next() + " ");
			System.out.print("Último nome: ");
			arquivo.print(teclado.next() + " ");
			System.out.print("Idade: ");
			arquivo.print(teclado.next() + " ");
			arquivo.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
