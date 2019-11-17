package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Utility class with method connectToDb() that will be used by other programs in this
//chapter
public class DbConnector {
	
	public static Connection connectToDb() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/";
		String database = "addressBook";
		String userName = "postgres";
		String password = "postgres";
		return DriverManager.getConnection(url + database, userName, password);
	}
	
}