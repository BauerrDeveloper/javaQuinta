package projetomaio;

public class UsaFinanceiro {

	public static void main(String[] args) {

		Financeiro objFinanceiro = new Financeiro();
		objFinanceiro.setProduto("CDB");
		objFinanceiro.setQuantidade(3);
		objFinanceiro.setValor(3000.00);
		
		Financeiro objFinanceiro2 = new Financeiro();
		objFinanceiro2.setProduto("Tesouro Direto");
		objFinanceiro2.setQuantidade(5);
		objFinanceiro2.setValor(3598.00);
		
		objFinanceiro.mostrarDados(objFinanceiro);		
		System.out.println(" ");
		objFinanceiro.mostrarDados(objFinanceiro2);
		
	}

}
