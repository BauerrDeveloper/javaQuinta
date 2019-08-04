package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

//public class Exercicio06 {
//
//	public static void main(String[] args) {
//		
//		Double pesoPrato = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do prato: "));
//		
//		JOptionPane.showMessageDialog(null, "Valor a ser pago: R$ " + (pesoPrato * 12));
//
//	}
//
//}

public class Exercicio06 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		JFrame janela1 = new JFrame("Teste de Menu");
		JLabel peso = new JLabel("Informe o peso do prato: ");
		JTextField entraPesoPrato = new JTextField();
		JButton calcular = new JButton("Calcular");

		janela1.setSize(470, 130);
		janela1.setLocationRelativeTo(null);
		janela1.setLayout(null);
		janela1.setVisible(true);
		janela1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		peso.setBounds(10, 5, 250, 25);
		janela1.add(peso);

		entraPesoPrato.setBounds(200, 5, 250, 25);
		janela1.add(entraPesoPrato);

		calcular.setBounds(200, 50, 100, 20);
		janela1.add(calcular);

		calcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DecimalFormat formatador = new DecimalFormat("0.00");

				Double pesoDoPrato = Double.parseDouble(entraPesoPrato.getText());

				JOptionPane.showMessageDialog(null, "Valor a ser pago: R$ " + formatador.format(pesoDoPrato * 12));

			}
		});

	}
}