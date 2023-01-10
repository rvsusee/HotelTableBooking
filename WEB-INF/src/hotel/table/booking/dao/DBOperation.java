package hotel.table.booking.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

import hotel.table.booking.configuration.ConnectionPooling;

public class DBOperation {
	private SCESession mySession;
	ConnectionPooling cp;

	public void uploadDetails(String query) throws SQLException {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Add Details From Database" + query, mySession);
		Connection connection = null;
		Statement statement = null;
		BasicDataSource dataSource = null;
		try {
			dataSource = cp.getDataSource();
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
			dataSource = cp.getDataSource();
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
}
