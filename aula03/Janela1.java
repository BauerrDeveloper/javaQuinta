package aula03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Janela1 extends JFrame {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Janela1 objJanela = new Janela1();
		JLabel labelNome = new JLabel();
		JLabel labelTelefone = new JLabel();
		JLabel labelEndereco = new JLabel();
		JLabel labelProfissao = new JLabel();
		JLabel labelNomeMae = new JLabel();
		JLabel labelNomePai = new JLabel();
		JTextField editNome = new JTextField();
		JTextField editTelefone = new JTextField();
		JTextField editEndereco = new JTextField();
		JTextField editProfissao = new JTextField();
		JTextField editNomeMae = new JTextField();
		JTextField editNomePai = new JTextField();
		JButton botaoConfirma = new JButton();
		
		
		objJanela.setTitle("Curso Java I");
		objJanela.setSize(600, 230);
		objJanela.setLocationRelativeTo(null);
		objJanela.setLayout(null);
		
		
		
		labelNome.setText("Digite seu nome: ");
		labelNome.setBounds(10, 5, 250, 25);
		objJanela.add(labelNome);
		
		labelTelefone.setText("Digite seu telefone: ");
		labelTelefone.setBounds(10, 32, 250, 25);
		objJanela.add(labelTelefone);
		
		labelEndereco.setText("Digite o endereço: ");
		labelEndereco.setBounds(10, 60, 250, 25);
		objJanela.add(labelEndereco);
		
		labelProfissao.setText("Digite a profissão: ");
		labelProfissao.setBounds(10, 90, 250, 25);
		objJanela.add(labelProfissao);
		
		labelNomeMae.setText("Nome da mãe: ");
		labelNomeMae.setBounds(10, 120, 250, 25);
		objJanela.add(labelNomeMae);
		
		labelNomePai.setText("Nome do pai: ");
		labelNomePai.setBounds(10, 150, 250, 25);
		objJanela.add(labelNomePai);
		
		
		
		editNome.setBounds(150, 5, 200, 25);
		objJanela.add(editNome);
		
		editTelefone.setBounds(150, 32, 200, 25);
		objJanela.add(editTelefone);
		
		editEndereco.setBounds(150, 60, 200, 25);
		objJanela.add(editEndereco);
		
		editProfissao.setBounds(150, 88, 200, 25);
		objJanela.add(editProfissao);
		
		editNomeMae.setBounds(150, 118, 200, 25);
		objJanela.add(editNomeMae);
		
		editNomePai.setBounds(150, 150, 200, 25);
		objJanela.add(editNomePai);
		
		
		botaoConfirma.setText("Confirmar");
		botaoConfirma.setBounds(450, 5, 120, 30);
		objJanela.add(botaoConfirma);
		
		botaoConfirma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olha eu aqui de novo", "Janelaaaaaaaaaaaaa", 1);
				
			}
		});		
		
		objJanela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		objJanela.setVisible(true);

	}

}
