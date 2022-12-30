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
	private Connection conn;
	private SCESession mySession;
	private Statement stmt;

	public Database(SCESession mySession) {

		this.mySession = mySession;
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Get DB Details from Properties file ", mySession);
		try {
			dbPropertyFile = new File(FILEPATH);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Properties file found", mySession);
			FileInputStream fileInput = new FileInputStream(dbPropertyFile);
			Properties properties = new Properties();
			properties.load(fileInput);
			DBUrl = properties.getProperty("database.url");
			DBDriver = properties.getProperty("database.driverClassName");
			DBUserName = properties.getProperty("database.usernames");
			DBPassword = properties.getProperty("database.password");
			fileInput.close();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Properties Access Successfully", mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
					"\nDatas : " + DBUrl + " " + DBDriver + " " + DBUserName + " " + DBPassword, mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Properties File Closed", mySession);

		} catch (FileNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,
					"Unable to Access Property file : FileNotFound" + e.getMessage(), mySession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Property File: IOException" + e.getMessage(), mySession);
			e.printStackTrace();
		}
	}

	private boolean DBCOnnect() {
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(DBUrl, DBUserName, DBPassword);
			stmt = conn.createStatement();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Database accessed succesfully", mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Statement Created", mySession);
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

	public boolean inSertDB(String insertQuery) {

		return false;
	}
}
