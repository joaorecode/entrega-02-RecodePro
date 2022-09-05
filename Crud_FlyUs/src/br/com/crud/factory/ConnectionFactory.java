package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	// Nome do usuário MySQL
	private static final String USERNAME = "root";
	// Senha MYSQL
	private static final String PASSWORD = "355543482";
	// URL do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/CRUDFLYUS";

	public static Connection createConnectionToMySQL() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;	
	}
	public static void Main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();
		if(con != null) {
			System.out.println("Conectado com sucesso!");
			con.close();
		}
	}
}