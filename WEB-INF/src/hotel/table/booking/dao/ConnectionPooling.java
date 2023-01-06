package hotel.table.booking.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionPooling {
	public Statement statement;

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

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		BasicDataSource dataSource = null;
		try {
			dataSource = new ConnectionPooling().getDataSource();
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from HOTEL_TABLE;");
			while (resultSet.next()) {
				System.out.println("id:" + resultSet.getInt("id"));
				System.out.println("size:" + resultSet.getInt("size"));
				System.out.println("branch_id:" + resultSet.getInt("branch_id"));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			resultSet.close();
			statement.close();
			connection.close();
			dataSource.close();
		}
	}

	public Statement getStatement() {
		return this.statement;
	}

}
