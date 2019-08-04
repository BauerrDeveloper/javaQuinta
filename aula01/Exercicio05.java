	package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//import javax.swing.JOptionPane;
//
//public class Exercicio05 {
//
//	public static void main(String[] args) {
//		
//		Double valorLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro da gasolina: R$ "));
//		Double valorAbastecimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do abastecimento: R$ "));
//		
//		JOptionPane.showMessageDialog(null, "A quantidade de litros colocada foi: " + (valorAbastecimento / valorLitro));
//		
//		
//		
//	}
//
//}

@SuppressWarnings("serial")
public class Exercicio05 extends JFrame {

	public static void main(String[] args) {

		JFrame novaJanela = new JFrame("Posto Jóia");
		JLabel labelLitro = new JLabel("Informe o valor do litro da gasolina: R$ ");
		JLabel labelAbastecimento = new JLabel("Informe o valor do abastecimento: R$");
		JTextField editLitro = new JTextField();
		JTextField editAbastecimento = new JTextField();
		JButton calcular = new JButton("Calcular");

		novaJanela.setSize(410, 150);
		novaJanela.setLocationRelativeTo(null);
		novaJanela.setLayout(null);
		novaJanela.setVisible(true);
		novaJanela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		labelLitro.setBounds(10, 5, 300, 25);
		novaJanela.add(labelLitro);

		labelAbastecimento.setBounds(10, 30, 300, 25);
		novaJanela.add(labelAbastecimento);

		editLitro.setBounds(295, 5, 100, 25);
		novaJanela.add(editLitro);

		editAbastecimento.setBounds(295, 30, 100, 25);
		novaJanela.add(editAbastecimento);

		
		calcular.setBounds(140, 70, 100, 25);
		novaJanela.add(calcular);

		calcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Double litro = Double.parseDouble(editLitro.getText());
				Double abastecimento = Double.parseDouble(editAbastecimento.getText());

				DecimalFormat formatador = new DecimalFormat("0.00");

				JOptionPane.showMessageDialog(null, "Total de litros: " + formatador.format(abastecimento / litro));

			}
		});

	}

}