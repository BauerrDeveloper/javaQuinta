package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



//public class Exercicio04 {
//
//	public static void main(String[] args) {
//		
//		String nome = JOptionPane.showInputDialog("Digite o nome: ");
//		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o a idade: "));
//		
//		
//		JOptionPane.showMessageDialog(null, nome + ", você já viveu " + (idade * 365) + " dias.");
//		
//
//	}
//
//}

public class Exercicio04 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		JFrame telaPrincipal = new JFrame("Dias Vividos");
		JLabel labelNome = new JLabel("Entre com o nome: ");
		JLabel labelIdade = new JLabel("Entre com a idade: ");
		JTextField editNome = new JTextField();
		JTextField editIdade = new JTextField();
		JButton calcula = new JButton("Calcular");

		
		telaPrincipal.setSize(230, 130);
		telaPrincipal.setLocationRelativeTo(null);
		telaPrincipal.setLayout(null);
		telaPrincipal.setVisible(true);
		telaPrincipal.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		labelNome.setBounds(10, 5, 250, 25);
		telaPrincipal.add(labelNome);

		labelIdade.setBounds(10, 30, 250, 25);
		telaPrincipal.add(labelIdade);

		editNome.setBounds(170, 5, 50, 25);
		telaPrincipal.add(editNome);

		editIdade.setBounds(170, 30, 50, 25);
		telaPrincipal.add(editIdade);

		calcula.setBounds(60, 65, 100, 25);
		telaPrincipal.add(calcula);
		
		calcula.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = editNome.getText();
				int idade = Integer.parseInt(editIdade.getText());
				
				JOptionPane.showMessageDialog(null, nome + ", você já viveu " + (idade * 365) + " dias.");
			}
		});
	
	}

}