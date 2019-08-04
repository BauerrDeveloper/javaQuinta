package aula04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double numero1;
	private Double numero2;
	private String operacao;

	public static void main(String[] args) {

		Calculadora objCalculadora = new Calculadora();

		objCalculadora.criarComponentes();

		objCalculadora.setTitle("Calculadora");
		objCalculadora.setSize(260, 238);
		objCalculadora.setLocationRelativeTo(null);
		objCalculadora.setLayout(null);
		objCalculadora.setVisible(true);
		objCalculadora.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public void criarComponentes() {
		JTextField visor = new JTextField();
		visor.setBounds(2, 2, 241, 30);
		this.add(visor);

		JButton botao1 = new JButton("1");
		botao1.setBounds(2, 33, 45, 40);
		this.add(botao1);

		JButton botao2 = new JButton("2");
		botao2.setBounds(48, 33, 45, 40);
		this.add(botao2);

		JButton botao3 = new JButton("3");
		botao3.setBounds(94, 33, 45, 40);
		this.add(botao3);

		JButton botao4 = new JButton("4");
		botao4.setBounds(2, 74, 45, 40);
		this.add(botao4);

		JButton botao5 = new JButton("5");
		botao5.setBounds(48, 74, 45, 40);
		this.add(botao5);

		JButton botao6 = new JButton("6");
		botao6.setBounds(94, 74, 45, 40);
		this.add(botao6);

		JButton botao7 = new JButton("7");
		botao7.setBounds(2, 115, 45, 40);
		this.add(botao7);

		JButton botao8 = new JButton("8");
		botao8.setBounds(48, 115, 45, 40);
		this.add(botao8);

		JButton botao9 = new JButton("9");
		botao9.setBounds(94, 115, 45, 40);
		this.add(botao9);

		JButton botao0 = new JButton("0");
		botao0.setBounds(48, 156, 45, 40);
		this.add(botao0);

		JButton botaoSoma = new JButton("+");
		botaoSoma.setBounds(150, 33, 45, 40);
		this.add(botaoSoma);

		JButton botaoSubtrai = new JButton("-");
		botaoSubtrai.setBounds(150, 74, 45, 40);
		this.add(botaoSubtrai);

		JButton botaoMultiplica = new JButton("*");
		botaoMultiplica.setBounds(150, 115, 45, 40);
		this.add(botaoMultiplica);

		JButton botaoDivide = new JButton("/");
		botaoDivide.setBounds(150, 156, 45, 40);
		this.add(botaoDivide);

		JButton botaoRaiz = new JButton("√");
		botaoRaiz.setBounds(196, 33, 46, 40);
		this.add(botaoRaiz);

		JButton botaoPonto = new JButton(".");
		botaoPonto.setBounds(94, 156, 45, 40);
		this.add(botaoPonto);

		JButton botaoC = new JButton("C");
		botaoC.setBounds(2, 156, 45, 40);
		this.add(botaoC);

		JButton botaoPorCento = new JButton("%");
		botaoPorCento.setBounds(196, 74, 46, 40);
		this.add(botaoPorCento);

		JButton botaoIgual = new JButton("=");
		botaoIgual.setBounds(196, 115, 45, 81);
		this.add(botaoIgual);

		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao1.getText());

			}
		});

		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao2.getText());

			}
		});

		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao3.getText());

			}
		});

		botao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao4.getText());

			}
		});

		botao5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao5.getText());

			}
		});

		botao6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao6.getText());

			}
		});

		botao7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao7.getText());

			}
		});

		botao8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao8.getText());

			}
		});

		botao9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao9.getText());

			}
		});

		botao0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + botao0.getText());

			}
		});

		botaoC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText("");

			}
		});

		botaoPonto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				visor.setText(visor.getText() + ".");

			}
		});

		botaoSoma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				numero1 = Double.parseDouble(visor.getText());
				operacao = "somar";
				visor.setText("");

			}
		});

		botaoSubtrai.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				numero1 = Double.parseDouble(visor.getText());
				operacao = "subtrair";
				visor.setText("");

			}
		});

		botaoMultiplica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				numero1 = Double.parseDouble(visor.getText());
				operacao = "multiplica";
				visor.setText("");

			}
		});

		botaoDivide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				numero1 = Double.parseDouble(visor.getText());
				operacao = "divide";
				visor.setText("");

			}
		});



		botaoRaiz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CalculoFinanceiro calculoRaiz = new CalculoFinanceiro();
				numero1 = Double.parseDouble(visor.getText());
				operacao = "raiz";
				Double resultado = calculoRaiz.raizCalc(numero1);
				visor.setText(resultado.toString());
			}

		});

		botaoIgual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				numero2 = Double.parseDouble(visor.getText());
				Double resultado;
				CalculoFinanceiro fimDaConta = new CalculoFinanceiro();

				if (operacao == "somar") {
					resultado = fimDaConta.somarValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

				if (operacao == "subtrair") {
					resultado = fimDaConta.subtrairValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

				if (operacao == "multiplica") {
					resultado = fimDaConta.multiplicarValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

				if (operacao == "divide") {
					resultado = fimDaConta.dividirValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

			}
		});

	}
}
