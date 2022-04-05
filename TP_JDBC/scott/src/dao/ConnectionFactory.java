package dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	public static void main(String[] args) {

		Properties props = new Properties();
		try (FileReader fis = new FileReader("jdbc.properties")) {
			props.load(fis);

			Class.forName(props.getProperty("jdbc.driver.class"));
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Driver inconnu - " + e.getMessage());
			System.exit(1);
		}

		String URLDB = props.getProperty("jdbc.url");
		String authorizationID = props.getProperty("jdbc.login");
		String password = props.getProperty("jdbc.password");

		try (Connection cnx = DriverManager.getConnection(URLDB, authorizationID, password)) {

			cnx.setAutoCommit(false);

		} catch (SQLException e) {
			System.out.println("Erreur accès DB - " + e.getMessage());
			System.exit(0);
		}
	}
}

