package projetomaio;
/*
 * Uma interface nao � uma classe.
 * Na interface s� colocamos a assinatura do metodo. N�o fazemos o codigo inteiro. 
 * A implementa��o � feita na classe que eu utilizo a interface.
 * Interface nao gera objeto. Gera constante. 
 * Interface gera implementa��es.
 * 
 * 
 */

public interface Medicos {

	public Double calculaSalario() throws Exception;
	public int geraIdade() throws Exception;
	public void escreveConsulta() throws Exception;
	
	
	
}
