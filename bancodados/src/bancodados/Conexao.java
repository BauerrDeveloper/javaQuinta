package bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {

	public Conexao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	protected static Connection getConexao() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquinta", "root", "");
		return con;
	}
	
	public static void main(String args[]) throws SQLException {
		
		Conexao xx = new Conexao();
		Connection con = xx.getConexao();
		System.out.println(con);
		
	}
	
}
