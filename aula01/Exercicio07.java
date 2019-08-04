package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


//public class Exercicio07 {
//
//	public static void main(String[] args) {
//
//		int dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia: "));
//		int mes = Integer.parseInt(JOptionPane.showInputDialog("Entre com o mês: "));
//
//		int diaInicioAno = 01;
//		int diaInicioMes = 01;
//
//		JOptionPane.showMessageDialog(null,
//				"Já se passaram " + ((dia - diaInicioAno) + (mes - diaInicioMes) * 30) + " dia(s) desde o início de 2019.");
//
//	}
//
//}

public class Exercicio07 {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Dias");
		JLabel textoDia = new JLabel("Entre com o dia: ");
		JLabel textoMes = new JLabel("Entre com o mês: ");
		JTextField entraDia = new JTextField();
		JTextField entraMes = new JTextField();
		JButton calcular = new JButton("Calcular");

		janela.setSize(200, 120);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.setVisible(true);
		

		textoDia.setBounds(10, 5, 300, 25);
		janela.add(textoDia);

		textoMes.setBounds(10, 30, 300, 25);
		janela.add(textoMes);

		entraDia.setBounds(140, 5, 50, 22);
		janela.add(entraDia);

		entraMes.setBounds(140, 30, 50, 22);
		janela.add(entraMes);

		calcular.setBounds(50, 60, 100, 20);
		janela.add(calcular);

		calcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int dia = Integer.parseInt(entraDia.getText());
				int mes = Integer.parseInt(entraMes.getText());
				
				int diaInicioAno = 01;
				int diaInicioMes = 01;
		
			JOptionPane.showMessageDialog(null,
				"Já se passaram " + ((dia - diaInicioAno) + (mes - diaInicioMes) * 30) + " dia(s) desde o início de 2019.");
				
			}
		});

	
	}

}