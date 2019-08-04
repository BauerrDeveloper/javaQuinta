package aula06;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FraseNoArquivo {

	public static void main(String[] args) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("c:\\dadosJava\\testeEscrita.txt");
			arquivo = new PrintWriter(out);
			arquivo.println("Teste de escrita no arquivo");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			arquivo.close();
		}
	}

}
