package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import aula03.Janela1;
//import javax.swing.JOptionPane;

/*public class Exercicio01 {

	public static void main(String[] args) {
		
		Double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno (m²): "));
		Double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terreno (m²): "));
		
		JOptionPane.showMessageDialog(null, "A área total do terreno é: " + (largura * comprimento) + "m².");	
	}

}*/

public class Exercicio01 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Janela1 dimensoesTerreno = new Janela1();
		JLabel labelLargura = new JLabel();
		JLabel labelComprimento = new JLabel();
		JTextField editLargura = new JTextField();
		JTextField editComprimento = new JTextField();
		JButton botaoCalculaArea = new JButton();

		dimensoesTerreno.setTitle("Imobiliária Imóbilis");
		dimensoesTerreno.setSize(730, 90);
		dimensoesTerreno.setLocationRelativeTo(null);
		dimensoesTerreno.setLayout(null);

		labelLargura.setText("Entre com a largura do terreno(m²): ");
		labelLargura.setBounds(10, 5, 250, 25);
		dimensoesTerreno.add(labelLargura);

		labelComprimento.setText("Entre com o comprimento do terreno(m²): ");
		labelComprimento.setBounds(10, 30, 450, 25);
		dimensoesTerreno.add(labelComprimento);

		editLargura.setBounds(300, 5, 250, 25);
		dimensoesTerreno.add(editLargura);

		editComprimento.setBounds(300, 32, 250, 25);
		dimensoesTerreno.add(editComprimento);

		botaoCalculaArea.setText("Calcular");
		botaoCalculaArea.setBounds(600, 5, 100, 25);
		dimensoesTerreno.add(botaoCalculaArea);

		botaoCalculaArea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Double largura = Double.parseDouble(editLargura.getText());
				Double comprimento = Double.parseDouble(editComprimento.getText());

				JOptionPane.showMessageDialog(null, "Área total do tereno (m²): " + (largura * comprimento));

			}
		});

		dimensoesTerreno.setVisible(true);
		dimensoesTerreno.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}