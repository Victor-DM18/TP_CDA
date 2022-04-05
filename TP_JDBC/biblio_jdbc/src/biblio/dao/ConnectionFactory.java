package biblio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private Connection cnx1;

	public Connection getConnection(String driver, String url, String user, String pwd)
			throws SQLException, ClassNotFoundException {
		if (cnx1 == null) {
			Class.forName(driver);
			cnx1 = DriverManager.getConnection(url, user, pwd);
		}
		cnx1.setAutoCommit(true);
		return cnx1;
	}

	public Connection getConnectionSansAutoCommit(String driver, String url, String user,
			String pwd) throws SQLException, ClassNotFoundException {
		Connection result = getConnection(driver, url, user, pwd);
		result.setAutoCommit(false);
		return result;

	}
}
