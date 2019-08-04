package aula05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Media extends JFrame{

	public static void main(String[] args) {
		
		Media med = new Media();
		JLabel lNota1 = new JLabel("Nota 1: ");
		JLabel lNota2 = new JLabel("Nota 2: ");
		JLabel lNota3 = new JLabel("Nota 3: ");
		JTextField tNota1 = new JTextField();
		JTextField tNota2 = new JTextField();
		JTextField tNota3 = new JTextField();
		JButton botaoCalcular = new JButton("Calcular");
		
		
		med.setTitle("Calculo da Média");
		med.setSize(300, 185);
		med.setLocationRelativeTo(null);
		med.setLayout(null);
		med.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		med.add(lNota1);
		med.add(tNota1);
		med.add(lNota2);
		med.add(tNota2);
		med.add(lNota3);
		med.add(tNota3);
		med.add(botaoCalcular);
		
		lNota1.setBounds(10, 5, 60, 30);
		tNota1.setBounds(65, 5, 60, 30);
		
		lNota2.setBounds(10, 37, 60, 30);
		tNota2.setBounds(65, 37, 60, 30);
		
		lNota3.setBounds(10, 69, 60, 30);
		tNota3.setBounds(65, 69, 60, 30);
		
		botaoCalcular.setBounds(10, 101, 115, 40);
		botaoCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CalculoMedia objMedia = new CalculoMedia();
				
				Double n1, n2, n3;
				
				n1 = Double.parseDouble(tNota1.getText());
				n2 = Double.parseDouble(tNota2.getText());
				n3 = Double.parseDouble(tNota3.getText());
				
				objMedia.setNota1(n1);
				objMedia.setNota2(n2);
				objMedia.setNota3(n3);
				
				JOptionPane.showMessageDialog(null, "Media " + objMedia.calcularMedia() + 
						"\n" + objMedia.situacaoAluno());
				
			}
		});
		
		med.setVisible(true);
	}

}
