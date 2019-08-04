import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolAcademia extends JFrame implements ActionListener, ItemListener {

	static JToolBar tb;
	static JButton b1, b2;
	static JFrame f;
	static JComboBox x;
	static JLabel l, l1;

	public static void main(String[] args) {

		Tool to = new Tool();
		l = new JLabel("Nada Selecionado");
		f = new JFrame("Barra de Ferramentas");
		f.setLayout(new BorderLayout());
		tb = new JToolBar();
		JPanel p = new JPanel();
		x = new JComboBox(new String[] { "Manhã", "Tarde", "Noite" });
		x.addItemListener(to);

		b1 = new JButton("Devedores");
		b2 = new JButton("Novo Aluno");
		b1.addActionListener(to);
		b2.addActionListener(to);

		p.add(b1);
		p.add(b2);
		p.add(x);

		tb.add(p);

		JPanel p1 = new JPanel();
		p1.add(l);
		p1.add(l1);

		f.add(tb, BorderLayout.NORTH);
		f.add(p1, BorderLayout.CENTER);
		f.setSize(500, 500);
		f.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		l1.setText(x.getSelectedItem() + "selecionado");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		l.setText(e.getActionCommand() + "selecionado");

	}

}
