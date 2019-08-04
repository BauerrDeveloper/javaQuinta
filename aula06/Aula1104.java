package aula06;

public class Aula1104 {

	static String nome = "Maria";
	/* variaveis estáticas so podem ser acessadas em metodos estaticos */

	public static void main(String[] args) {

		final String CIDADE = "São José";
		/*
		 * Usa-se final quando criamos uma constante, algo que não vai mudar. Todas as
		 * letras maiúsculas. Geralmente já criamos a constante com valor definido.
		 */

		System.out.println(nome);
		System.out.println(CIDADE);

		Aula1104 objAula = new Aula1104();

		nome = "Roger";

		System.out.println(objAula.gerarNome());

	}

	public String gerarNome() {

		System.out.println(nome);

		return "Paula";
	}

}
