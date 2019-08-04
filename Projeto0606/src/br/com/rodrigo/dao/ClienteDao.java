package br.com.rodrigo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import br.com.rodrigo.conexao.Conexao;
import br.com.rodrigo.interfaces.ICliente;
import br.com.rodrigo.model.Cliente;
import br.com.rodrigo.model.Cliente;

public class ClienteDao extends Conexao implements ICliente {

	Connection con;
	ResultSet rs;
	Statement stm;
	PreparedStatement pstmt; // aqui usamos os pontos de interrogação

	public ClienteDao() {

	}

	@Override
	public void inserirClient(Cliente objc) throws Exception {
		con = this.conectar();
		String sqlI = "Insert into clientes (nome, telefone, cpf) values (?,?,?)";
		pstmt = con.prepareStatement(sqlI);
		pstmt.setString(1, objc.getNome());
		pstmt.setString(2, objc.getTelefone());
		pstmt.setString(3, objc.getCpf());
		pstmt.execute();
		con.close();

	}

	@Override
	public List<Cliente> listaTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirCliente(int id) throws Exception {
		con = this.conectar();
		String sqlI = "Delete from clientes where id = ?";
		pstmt = con.prepareStatement(sqlI);
		pstmt.setInt(1, id);
		pstmt.execute();
		con.close();

	}

	@Override
	public void atualizarCliente(Cliente objc) throws Exception {
		con = this.conectar();
		String sqlI = "update clientes set nome = ?, telefone = ?, cpf = ? where id = ?";
		pstmt = con.prepareStatement(sqlI);
		pstmt.setString(1, objc.getNome());
		pstmt.setString(2, objc.getTelefone());
		pstmt.setString(3, objc.getCpf());
		pstmt.setInt(4, objc.getId());
		pstmt.execute();
		con.close();

	}

	@Override
	public Cliente retornaCliente(int id) throws Exception {
		con = this.conectar();
		Cliente p = null;
		String sql = "Select * from clientes where id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			p = new Cliente();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			p.setTelefone(rs.getString("telefone"));
			p.setCpf(rs.getString("cpf"));

		}
		pstmt.close();
		con.close();

		return p;
	}

}
