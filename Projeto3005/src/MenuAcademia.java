import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuAcademia extends JFrame implements ActionListener {
	
	static JMenuBar barraDoMenu;
	static JMenu alunos, pagamentos, agenda;
	static JMenuItem novoAluno, consulta, pagarMensalidade, debitos, bomPagadores, horarios;
	static JFrame frame;
	static JLabel label;

	public static void main(String[] args) {

		MenuAcademia menu = new MenuAcademia();
		frame = new JFrame("Academia Life Fitness");
		label = new JLabel("Nenhum Item Selecionado");
		barraDoMenu = new JMenuBar();
		
		alunos = new JMenu("Aluno");
		pagamentos = new JMenu("Pagamentos");
		agenda = new JMenu("Agenda");
		
		novoAluno = new JMenuItem("Novo Aluno");
		consulta = new JMenuItem("Consulta");
		pagarMensalidade = new JMenuItem("Pagar Mensalidade");
		debitos = new JMenuItem("Debitos");
		bomPagadores = new JMenuItem("Bom pagador");
		horarios = new JMenuItem("Horarios");
		
		novoAluno.addActionListener(menu);
		consulta.addActionListener(menu);
		pagarMensalidade.addActionListener(menu);
		debitos.addActionListener(menu);
		bomPagadores.addActionListener(menu);
		horarios.addActionListener(menu);
		
		alunos.add(novoAluno);
		alunos.add(consulta);
		pagamentos.add(pagarMensalidade);
		pagamentos.add(debitos);
		pagamentos.add(bomPagadores);
		agenda.add(horarios);
		
		barraDoMenu.add(alunos);
		barraDoMenu.add(pagamentos);
		barraDoMenu.add(agenda);
		
		frame.setJMenuBar(barraDoMenu);
		frame.add(label);
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		label.setText(s + "Selecionado");

	}

}
