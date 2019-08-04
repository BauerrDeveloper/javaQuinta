package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import aula03.Janela1;

/*import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		int paes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pães vendidos: "));
		int broas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de broas vendidos: "));

		Double totPaes = paes * 0.12;
		Double totBroas = broas * 1.50;
		Double totVendas = totBroas + totPaes;

		JOptionPane.showMessageDialog(null, "O valor arrecadado com as vendas de pães foi: R$ " + totPaes + "\n"
				+ "O valor arrecadado com a venda de broas foi: R$ " + totBroas + "\n" + "Valor total de vendas: R$"
				+ (totVendas) + "\n" + "Deverá ser guardado na conta poupança: R$ " + (totVendas * 10) / 100);

	}

}*/

public class Exercicio03 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Janela1 tela = new Janela1();
		JLabel labelPaes = new JLabel();
		JLabel labelBroas = new JLabel();
		JTextField editPaes = new JTextField();
		JTextField editBroas = new JTextField();
		JButton botaoCalcula = new JButton();

		tela.setTitle("Padaria HotPão");
		tela.setSize(580, 150);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		labelPaes.setText("Entre com a quantidade de pães: ");
		labelPaes.setBounds(10, 5, 250, 25);
		tela.add(labelPaes);

		labelBroas.setText("Entre com a quantidade de broas: ");
		labelBroas.setBounds(10, 30, 250, 25);
		tela.add(labelBroas);

		editPaes.setBounds(255, 5, 250, 25);
		tela.add(editPaes);

		editBroas.setBounds(255, 32, 250, 25);
		tela.add(editBroas);

		botaoCalcula.setText("Calcular");
		botaoCalcula.setBounds(250, 75, 100, 25);
		tela.add(botaoCalcula);
		botaoCalcula.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Double paes = Double.parseDouble(editPaes.getText());
				Double broas = Double.parseDouble(editBroas.getText());

				DecimalFormat formatador = new DecimalFormat("0.00");

				Double totPaes = (double) Math.round(paes * 0.12);
				Double totBroas = (double) Math.round(broas * 1.50);
				Double totVendas = totBroas + totPaes;

				JOptionPane.showMessageDialog(null, "O valor arrecadado com as vendas de pães foi: R$ " + totPaes + "\n"
						+ "O valor arrecadado com a venda de broas foi: R$ " + totBroas + "\n"
						+ "Valor total de vendas: R$" + (totVendas) + "\n"
						+ "Deverá ser guardado na conta poupança: R$ " + formatador.format((totVendas * 10) / 100));

			}

		});

	}

}