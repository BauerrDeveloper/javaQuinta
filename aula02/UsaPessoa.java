package aula02;

import java.util.Date;

import javax.swing.JOptionPane;

public class UsaPessoa {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();

		pessoa1.nome = "Maria Joaquina";
		pessoa1.idade = 20;

		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Nelson";
		pessoa2.idade = 31;

		Pessoa pessoa3 = new Pessoa();

		pessoa3.nome = "Rodrigo";
		pessoa3.idade = 33;

		Pessoa pessoa4 = new Pessoa();
		pessoa4.nome = "Gabriel";
		pessoa4.idade = 30;

		Pessoa pessoa5 = new Pessoa();
		pessoa5.nome = "Rafael";
		pessoa5.idade = 35;

		Pessoa pessoa6 = new Pessoa();
		pessoa6.nome = "Larissa";
		pessoa6.idade = 27;

		JOptionPane.showMessageDialog(null,
				"Pessoa1: " + pessoa1.nome + " " + pessoa1.idade + "\n" + "Pessoa2: " + pessoa2.nome + " "
						+ pessoa2.idade + "\n" + "Pessoa3: " + pessoa3.nome + " " + pessoa3.idade + "\n" + "Pessoa4: "
						+ pessoa4.nome + " " + pessoa4.idade + "\n" + "Pessoa5: " + pessoa5.nome + " " + pessoa5.idade
						+ "\n" + "Pessoa6: " + pessoa6.nome + " " + pessoa6.idade);

		PessoaFisica pessoaf1 = new PessoaFisica();
		pessoaf1.setNome("Rodrigo");
		pessoaf1.setCpf("052.340.959-16");
		pessoaf1.setEndereco("Avenida Beira Mar, 2540");
		pessoaf1.setIdade(33);
		pessoaf1.setDataNascimento(new Date("09/03/1985"));

		PessoaJuridica pessoaj1 = new PessoaJuridica();
		pessoaj1.setNome("Casas Bahia");
		pessoaj1.setIdade(30);
		pessoaj1.setEndereco("Rua Trajano, 1567");
		pessoaj1.setCnpj("123.456.789/0001-98");

		JOptionPane.showMessageDialog(null,
				"Pessoa 1: " + "\n" + "Nome: " + pessoaf1.getNome() + "\n" + "CPF: " + pessoaf1.getCpf() + "\n"
						+ "Endereço: " + pessoaf1.getEndereco() + "\n" + "Idade: " + pessoaf1.getIdade() + "\n"
						+ "Data de Nascimento: " + pessoaf1.getDataNascimento() + "\n" + "\n" + "Pessoa 2: " + "\n"
						+ "Nome Fantasia: " + pessoaj1.getNome() + "\n" + "Data de abertura: " + pessoaj1.getIdade()
						+ "\n" + "Endereço: " + pessoaj1.getEndereco() + "\n" + "CNPJ: " + pessoaj1.getCnpj());

	}

}
