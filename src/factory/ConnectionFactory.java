// situa em qual package ou "pacote" está a classe

package factory;
// faz as importações de classes necessárias para o funcionamento do programa

import java.sql.Connection;
// coonexão SQL para Java

import java.sql.DriverManager;
// driver de conexão SQL para Java

import java.sql.SQLException;
// classe para tratamento de exceções

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return
					DriverManager.getConnection("jdbc:mysql://localhost/projetojava","root","LoL1345355*");
		}
		catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		}
	}
}
