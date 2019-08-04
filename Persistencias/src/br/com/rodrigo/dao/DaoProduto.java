package br.com.rodrigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.rodrigo.Conexao;
import br.com.rodrigo.interfaces.IProduto;
import br.com.rodrigo.model.Produto;

public class DaoProduto extends Conexao implements IProduto{
	
	Connection con;
	ResultSet rs;
	Statement stm;
	PreparedStatement pstmt;
	
	
	
	public DaoProduto() {
		
	}
	
	@Override
	public void inserirProduto (Produto objp) throws Exception {
		con = this.conectar();
		String sqlI = "Insert into produtob (nome, telefone) values (?,?)";
		pstmt = con.prepareStatement(sqlI);
		pstmt.setString(1, objp.getNome());
		pstmt.setString(2, objp.getTelefone());
		pstmt.execute();
	
	}
	
	@Override
	public List<Produto> listaTodos() throws Exception {
		List<Produto> lista = new ArrayList<Produto>();
		Produto iprod;
		String sql = "select * from produtob";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			iprod = new Produto();
			iprod.setId(rs.getInt("id"));
			iprod.setNome(rs.getString("nome"));
			iprod.setTelefone(rs.getString("telefone"));
			lista.add(iprod);
		}
		return lista;
	}

	@Override
	public void excluirProduto(int id) throws Exception {
		con = this.conectar();
		String sqlI = "Delete from produtob where id = ?";
		pstmt = con.prepareStatement(sqlI);
		pstmt.setInt(1, id);
		pstmt.execute();
		
		
	}

	@Override
	public void atualizarProduto(Produto objp) throws Exception {
		
				
	}
	
}
