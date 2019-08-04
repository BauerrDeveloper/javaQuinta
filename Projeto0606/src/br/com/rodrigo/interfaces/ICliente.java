package br.com.rodrigo.interfaces;

import java.util.List;

import br.com.rodrigo.model.Cliente;
import br.com.rodrigo.model.Venda;

public interface ICliente {
	
	public void inserirClient(Cliente objc) throws Exception;
	public List<Cliente> listaTodos() throws Exception;
	public void excluirCliente(int id) throws Exception;
	public void atualizarCliente(Cliente objc) throws Exception;
	public Cliente retornaCliente(int id) throws Exception;
	 
	
	

}
