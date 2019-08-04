package aula01;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {

		Double horaTrabalhada = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Informe a jornada normal diária do funcionário: ", "Hipotheticus Company", 1));
		int diasTrabalhados = Integer
				.parseInt(JOptionPane.showInputDialog("Informe quantos dias do mês o funcinário trabalhou: "));
		Double teveHoraExtra = Double.parseDouble(
				JOptionPane.showInputDialog("Informe a quantidade de horas extras do funcionário no mês: "));

		Double custoHoraTrabalhada = 10.0;
		Double custoHoraExtra = 15.0;

		Double valorSalario = (horaTrabalhada * custoHoraTrabalhada) * diasTrabalhados;
		Double valorHoraExtra = teveHoraExtra * custoHoraExtra;
		Double salarioBruto = valorSalario + valorHoraExtra;
		Double salarioLiquido = salarioBruto - (salarioBruto * 0.01);

		JOptionPane.showMessageDialog(null,
				"O funcionário irá receber o valor de R$ " + valorSalario + " por " + diasTrabalhados
						+ " dias trabalhados. " + "\n" + "Irá receber também R$ " + valorHoraExtra + " por "
						+ teveHoraExtra + " horas extras. " + "\n" + "\n" + "Salário bruto: R$ " + salarioBruto + "\n"
						+ "Salário liquido: R$ " + salarioLiquido);

	}

}
