package hotel.table.booking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

final public class Database {
	private final String FILEPATH = "D:\\\\AVAYA Project\\\\HotelTableBooking\\\\data\\\\Database.properties";
	private File dbPropertyFile;
	private String DBUrl;
	private String DBDriver;
	private String DBUserName;
	private String DBPassword;
	private static Connection conn = null;
	private Statement stmt;
	private SCESession mySession;

	public Database(SCESession mySession) {
		this.mySession = mySession;
		if (!status()) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DB Connection Not Found", mySession);
			if (getValueFromPropertyFile()) {
				createDBConnection();
			} else {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Unable to Fetch Property File", mySession);
			}
		} else {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DB Connection Already Established", mySession);
		}
	}

	private boolean getValueFromPropertyFile() {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Get DB Details from Properties file ", mySession);
		try {
			dbPropertyFile = new File(FILEPATH);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Properties file found", mySession);
			FileInputStream fileInput = new FileInputStream(dbPropertyFile);
			Properties properties = new Properties();
			properties.load(fileInput);
			DBUrl = properties.getProperty("database.url");
			DBDriver = properties.getProperty("database.driverClassName");
			DBUserName = properties.getProperty("database.username");
			DBPassword = properties.getProperty("database.password");
			fileInput.close();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Properties Access Successfully", mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
					"\nDatas : " + DBUrl + " " + DBDriver + " " + DBUserName + " " + DBPassword, mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Properties File Closed", mySession);
			return true;
		} catch (FileNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,
					"Unable to Access Property file : FileNotFound" + e.getMessage(), mySession);
			return false;
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Property File: IOException" + e.getMessage(), mySession);
			return false;
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Property File: Exception" + e.getMessage(), mySession);
			return false;
		}
	}

	private boolean createDBConnection() {
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(DBUrl, DBUserName, DBPassword);
			stmt = conn.createStatement();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Database accessed succesfully", mySession);
			return true;
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Database Connection Failed" + e.getMessage(), mySession);
			return false;
		} catch (ClassNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,
					"Database Connection Failed- ClassNotFoundException" + e.getMessage(), mySession);
			return false;
		}
	}

	public boolean status() {
		try {
			if (null == conn) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Connection Already Closed", mySession);
				return false;
			} else {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Connection Already Established", mySession);
				return true;
			}

		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Database Status Not Found" + e.getMessage(), mySession);
		}
		return false;
	}

	public Statement getStatement() {
		return stmt;
	}
}
