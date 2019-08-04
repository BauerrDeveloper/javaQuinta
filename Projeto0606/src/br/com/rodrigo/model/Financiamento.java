package br.com.rodrigo.model;

public class Financiamento {

	private String nome;
	private Double valor;
	private Double total;

	public static void main(String[] args) {

		Financiamento obj = new Financiamento();

		try {

			obj.setNome("Maria");
			obj.setValor(1000.00);
			obj.setTotal(obj.getValor() * 1.25);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			/**colocamos fechamento de arquivo, fechamento de banco de dados, 
			ou um codigo que queremos executar independentemente do try/catch**/
		}

		System.out.println(obj.getNome());
		System.out.println(obj.getValor());
		System.out.println(obj.getTotal());

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
