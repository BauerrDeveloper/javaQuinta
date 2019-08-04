package br.com.rodrigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.rodrigo.Conexao;
import br.com.rodrigo.interfaces.IAluno;
import br.com.rodrigo.model.Aluno;
import br.com.rodrigo.model.Produto;

public class DaoAluno extends Conexao implements IAluno {
	
	Connection con;
	ResultSet rs;
	Statement stm;
	PreparedStatement pstmt;


	
	public DaoAluno() { 
		
	}

	@Override
	public void inserirAluno(Aluno aluno1) throws Exception {		
	con = Conexao.conectar();
	String sqlI = "Insert into aluno2 (nome, cpf, matricula) values (?,?,?)";
	pstmt = con.prepareStatement(sqlI);
	pstmt.setString(1, aluno1.getNome());
	pstmt.setString(2, aluno1.getCpf());
	pstmt.setString(3, aluno1.getMatricula());
	pstmt.execute();
	
	pstmt.close();
	con.close();
		
		
	}

	@Override
	public List<Aluno> listaTodos() throws Exception {
		con = Conexao.conectar();
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno iAluno;
		String sql = "select * from aluno2";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			iAluno = new Aluno();
			iAluno.setId(rs.getInt("id"));
			iAluno.setNome(rs.getString("nome"));
			iAluno.setCpf(rs.getString("cpf"));
			iAluno.setMatricula(rs.getString("matricula"));
			lista.add(iAluno);
		}
		pstmt.close();
		con.close();
		return lista;
	}

	@Override
	public void excluirAluno(int id) throws Exception {
		con = Conexao.conectar();
		String sqlI = "delete from aluno where id = ?";
		pstmt = con.prepareStatement(sqlI);
		pstmt.setInt(1, id);
		pstmt.execute();
		pstmt.close();
		con.close();
		
	}

	@Override
	public void atualizarAluno(Aluno objp) throws Exception {
		con = Conexao.conectar();	
		String sqlI = "update aluno2 set nome = ?, cpf = ?, matricula = ? where id = ?";
		pstmt = con.prepareStatement(sqlI);
		pstmt.setString(1, objp.getNome());
		pstmt.setString(2, objp.getCpf());
		pstmt.setString(3, objp.getMatricula());
		pstmt.setInt(4, objp.getId());
		pstmt.execute();
		pstmt.close();
		con.close();
	}
	
	public Aluno retornaAluno (int id) throws Exception{
		Aluno p = null;
		String sql = "Select * from aluno2 where id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			p = new Aluno();
			p.setId(rs.getInt("nome"));
			p.setNome(rs.getString("nome"));
			p.setCpf(rs.getString("cpf"));
			p.setMatricula(rs.getString("matricula"));
		}
		pstmt.close();
		con.close();
		return p;
		
	}

	@Override
	public List<Aluno> listaPorRange(int id1, int id2) throws Exception {
		con = Conexao.conectar();
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno iAluno;
		String sql = "select * from aluno2 where id between ? and ?";
		pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, id1);
		pstmt.setInt(2, id2);
		
		rs = pstmt.executeQuery();
		while (rs.next()) {
			iAluno = new Aluno();
			iAluno.setId(rs.getInt("id"));
			iAluno.setNome(rs.getString("nome"));
			iAluno.setCpf(rs.getString("cpf"));
			iAluno.setMatricula(rs.getString("matricula"));
			lista.add(iAluno);
		}
		pstmt.close();
		con.close();
		return lista;
		
	}

	@Override
	public List<Aluno> listaPorNomeInicio(String inicio) throws Exception {
		con = Conexao.conectar();
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno iAluno;
		String sql = "select * from aluno2 where nome like '"+inicio+"%'";

		stm = con.createStatement();

		
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			iAluno = new Aluno();
			iAluno.setId(rs.getInt("id"));
			iAluno.setNome(rs.getString("nome"));
			iAluno.setCpf(rs.getString("cpf"));
			iAluno.setMatricula(rs.getString("matricula"));
			lista.add(iAluno);
		}
		pstmt.close();
		con.close();
		return lista;
		
	}



}
