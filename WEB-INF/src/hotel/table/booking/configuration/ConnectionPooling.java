package hotel.table.booking.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class ConnectionPooling {

	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	private static String DRIVER;
	private static boolean isAlreadyRead = false;
	private SCESession mySession;

	public ConnectionPooling(SCESession mySession) {
		this.mySession = mySession;
		if (!isAlreadyRead) {
			if (readPropertyFile())
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "PropertyFile-Read-Success", mySession);
			else
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "PropertyFile-Read_Failed", mySession);
		} else {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DataBase values alread readed from property file", mySession);
		}
	}

	public BasicDataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(URL);
		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		dataSource.setDriverClassName(DRIVER);
		dataSource.setMinIdle(5);
		dataSource.setMaxIdle(10);
		dataSource.setMaxTotal(25);
		return dataSource;
	}

	public void uploadDetails(String query) throws SQLException {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Add Details From Database" + query, mySession);
		Connection connection = null;
		Statement statement = null;
		BasicDataSource dataSource = null;
		try {
			dataSource = getDataSource();
			connection = dataSource.getConnection();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Connection Created", mySession);
			statement = connection.createStatement();
			statement.execute(query);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Query Executed Successfully", mySession);
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "SQLException Occured" + e.toString(), mySession);
		} finally {
			try {
				statement.close();
				connection.close();
				dataSource.close();
			} catch (Exception e) {
			}
		}
	}

	public ResultSet getBookingDetails(String query) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Get Details From Database " + query, mySession);
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		BasicDataSource dataSource = null;
		try {
			dataSource = getDataSource();
			connection = dataSource.getConnection();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Connection Created", mySession);
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Query Executed Successfully", mySession);
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "SQLException Occured" + e.toString(), mySession);
		}

		finally {
			try {
				statement.close();
				connection.close();
				dataSource.close();
			} catch (Exception e) {

			}
		}
		return rs;
	}

	private boolean readPropertyFile() {
		File file = new File("D:\\AVAYA Project\\HotelTableBooking\\data\\Database.properties");
		FileInputStream fileInput = null;
		Properties properties = null;
		try {
			fileInput = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInput);
			DRIVER = properties.getProperty("database.driverClassName");
			URL = properties.getProperty("database.url");
			USERNAME = properties.getProperty("database.username");
			PASSWORD = properties.getProperty("database.password");
			fileInput.close();
			isAlreadyRead = true;
			return true;
		} catch (FileNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Property File Exception" + e.toString(), mySession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Property File IOException" + e.toString(), mySession);
		}
		try {
			fileInput.close();
		} catch (IOException e) {
		}
		isAlreadyRead = true;
		return false;
	}

}
