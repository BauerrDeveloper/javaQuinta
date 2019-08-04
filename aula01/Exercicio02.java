package aula01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;

import aula03.Janela1;

/*public class Exercicio02 {

	public static void main(String[] args) {
		
		int cavalos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos do haras: "));
		
		JOptionPane.showMessageDialog(null, "Você precisa comprar " + (cavalos * 4) + " ferraduras.");
		
	}

}*/

public class Exercicio02 extends JFrame {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Janela1 calculoFerradura = new Janela1();
		JLabel labelQuantidadeCavalos = new JLabel();
		JTextField editQuantidadeCavalos = new JTextField();
		JButton calcula = new JButton();
		
		calculoFerradura.setTitle("Haras Ypê - Florianópolis/SC");
		calculoFerradura.setSize(730, 80);
		calculoFerradura.setLocationRelativeTo(null);
		calculoFerradura.setLayout(null);
		calculoFerradura.setVisible(true);
		calculoFerradura.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		labelQuantidadeCavalos.setText("Entre com a quantidade de cavalos: ");
		labelQuantidadeCavalos.setBounds(10, 5, 250, 30);
		calculoFerradura.add(labelQuantidadeCavalos);
		
		editQuantidadeCavalos.setBounds(300, 7, 250, 25);
		calculoFerradura.add(editQuantidadeCavalos);
		
		calcula.setText("Calcula");
		calcula.setBounds(600, 5, 100, 25);
		calculoFerradura.add(calcula);
		
		calcula.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			int cavalos = Integer.parseInt(editQuantidadeCavalos.getText());
			
			JOptionPane.showMessageDialog(null, "Quantidade necessária de ferraduras: " + (cavalos * 4));
			
			}
		});
		
		
	}

}
