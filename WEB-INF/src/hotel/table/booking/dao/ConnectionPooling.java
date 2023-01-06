package hotel.table.booking.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionPooling {

	public BasicDataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(
				"jdbc:sqlserver://192.168.168.12:1433;databaseName=_Suseendhiran2022;encrypt=true;trustServerCertificate=true;");
		dataSource.setUsername("NewJoinee2022");
		dataSource.setPassword("P@ssw0rd");
		dataSource.setMinIdle(5);
		dataSource.setMaxIdle(10);
		dataSource.setMaxTotal(25);
		return dataSource;
	}

	public void uploadBooking(String query) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		BasicDataSource dataSource = null;
		try {
			dataSource = new ConnectionPooling().getDataSource();
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			statement.execute(query);
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			statement.close();
			connection.close();
			dataSource.close();
		}
	}
}
