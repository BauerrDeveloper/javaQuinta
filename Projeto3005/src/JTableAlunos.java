import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableAlunos {

	JFrame frame;
	JTable tabela;
	
	public JTableAlunos() {
		
		frame = new JFrame("Alunos");
		String [][] dadosAlunos = {{"0001", "Rodrigo Paulo", "99935-5870", "Florian�polis", "Itacorubi", "JCAVI"}, 
				{"0002", "Maria Ana", "99900-2408", "Florian�polis", "Itacorubi", "VOffice"}};
		
		String[] nomeDasColunas = {"C�digo", "Nome", "Telefone", "Municipio", "Bairro", "Escola"};
		
		tabela = new JTable(dadosAlunos, nomeDasColunas);
		tabela.setBounds(30,40,500,300);
		
		JScrollPane scroolPane = new JScrollPane(tabela);
		frame.add(scroolPane);
		frame.setSize(800, 150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableAlunos();
	}
	
}
