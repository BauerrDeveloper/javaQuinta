package br.com.rodrigo.interfaces;

import java.util.List;

import br.com.rodrigo.model.Aluno;
import br.com.rodrigo.model.Produto;

public interface IAluno {
	
	public void inserirAluno(Aluno aluno1) throws Exception;
	public List<Aluno> listaTodos() throws Exception;
	public List<Aluno> listaPorRange(int id1, int id2) throws Exception;
	public List<Aluno> listaPorNomeInicio(String inicio) throws Exception;
	public void excluirAluno(int id) throws Exception;
	public void atualizarAluno(Aluno objp) throws Exception;
	public Aluno retornaAluno(int id) throws Exception;
	
	
	
}
