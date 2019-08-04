package jjtable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import classes.Header;
import classes.LerArquivo;

public class JtableExemplo extends JFrame {
	public JtableExemplo() {
		// headers for the table
		String[] columns = new String[] { "Id", "Name", "Hourly Rate", "Part Time" };

		List<Produto> lista = new ArrayList<Produto>();

		List<Header> listab  = LerArquivo.list;
		for(Header h:listab) {
			System.out.println(h.getEmpresa());
			System.out.println(h.getOperadora());
		}
		
		Produto p1 = new Produto();
		p1.setCodigo("1");
		p1.setDesconto(1.0);
		p1.setNome("NOVO");
		p1.setPreco(98.0);
		
		Produto p2 = new Produto();
		p2.setCodigo("2");
		p2.setDesconto(15.0);
		p2.setNome("NOVO"); 
		p2.setPreco(90.0);
		
		Produto p3 = new Produto();
		p3.setCodigo("3");
		p3.setDesconto(11.0);
		p3.setNome("NOVO");
		p3.setPreco(93.0);
		
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		//final Class[] columnClass = new Class[] { Integer.class, String.class, Double.class, Boolean.class };
		// create table model with data
		DefaultTableModel model = new DefaultTableModel() {
			private static final long serialVersionUID = 1L;
		};

		model.setColumnIdentifiers(columns);

		for (int i = 0; i < lista.size(); i++) {
			Object[] data1 = new Object[] { lista.get(i).getCodigo(), lista.get(i).getNome(), 
					lista.get(i).getDesconto(), lista.get(i).getPreco() };
			model.insertRow(i, data1);
		}
		JTable table = new JTable(model);

		// add the table to the frame
		this.add(new JScrollPane(table));

		this.setTitle("Table Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JtableExemplo();
			}
		});
	}
}