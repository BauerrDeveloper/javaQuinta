package aula05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Imc extends JFrame {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Calculo de IMC");
		JLabel labelPeso = new JLabel("Peso (kg): ");
		JLabel labelAltura = new JLabel("Altura(m): ");
		JTextField entraPeso = new JTextField();
		JTextField entraAltura = new JTextField();
		JButton botaoCalcular = new JButton("Calcular IMC");

		janela.setSize(270, 160);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		janela.setVisible(true);

		labelPeso.setBounds(10, 5, 60, 30);
		janela.add(labelPeso);
		labelAltura.setBounds(10, 30, 80, 30);
		janela.add(labelAltura);

		entraPeso.setBounds(85, 5, 150, 25);
		janela.add(entraPeso);
		entraAltura.setBounds(85, 35, 150, 25);
		janela.add(entraAltura);

		botaoCalcular.setBounds(50, 80, 150, 30);
		janela.add(botaoCalcular);
		botaoCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CalculoImc resultadoAvaliacao = new CalculoImc();
				DecimalFormat formatador = new DecimalFormat("0.00");

				Double n1, n2;

				n1 = Double.parseDouble(entraPeso.getText());
				n2 = Double.parseDouble(entraAltura.getText());

				resultadoAvaliacao.setPeso(n1);
				resultadoAvaliacao.setAltura(n2);

				JOptionPane.showMessageDialog(null, "Valor do IMC: " + formatador.format(resultadoAvaliacao.calcularImc()) + "\n"
						+ "Resultado: " + resultadoAvaliacao.situacaoImc());

			}
		});

	}

}
