package br.com.rodrigo.interfaces;

import java.util.List;

import br.com.rodrigo.model.Produto;

public interface IProduto {
	
	public void inserirProduto(Produto objp) throws Exception;
	public List<Produto> listaTodos() throws Exception;
	public void excluirProduto(int id) throws Exception;
	public void atualizarProduto(Produto objp) throws Exception;

}
