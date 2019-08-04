package projetomaio;
/*
 * Uma interface nao é uma classe.
 * Na interface só colocamos a assinatura do metodo. Não fazemos o codigo inteiro. 
 * A implementação é feita na classe que eu utilizo a interface.
 * Interface nao gera objeto. Gera constante. 
 * Interface gera implementações.
 * 
 * 
 */

public interface Medicos {

	public Double calculaSalario() throws Exception;
	public int geraIdade() throws Exception;
	public void escreveConsulta() throws Exception;
	
	
	
}
