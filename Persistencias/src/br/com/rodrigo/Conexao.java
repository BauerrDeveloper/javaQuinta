package br.com.rodrigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	
	public Conexao() {
		
	}
		
		public static Connection conectar() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquinta", "root", "");
			return con;
		}
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			
			Connection c = conectar();
			//System.out.println("Conex�o bem sucedida no banco de dados!");
		JOptionPane.showMessageDialog(null, "Conex�o com o banco de dados bem sucedida!");
		}
		
	}
	
	

