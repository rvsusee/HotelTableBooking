package hotel.table.booking.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionPooling {
	private static BasicDataSource dataSource = null;
	static {
		dataSource = new BasicDataSource();
		dataSource.setUrl(
				"jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022;encrypt=true;trustServerCertificate=true;");
		dataSource.setUsername("NewJoinee2022");
		dataSource.setPassword("ssw0rd");

		dataSource.setMinIdle(5);
		dataSource.setMaxIdle(10);
		dataSource.setMaxTotal(25);

	}

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from tblemployee");
			while (resultSet.next()) {
				System.out.println("empId:" + resultSet.getInt("empId"));
				System.out.println("empName:" + resultSet.getString("empName"));
				System.out.println("dob:" + resultSet.getDate("dob"));
				System.out.println("designation:" + resultSet.getString("designation"));
			}
		} finally {

			resultSet.close();
			statement.close();
			connection.close();
		}
	}
}
