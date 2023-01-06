package flow;

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

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing
 * mathematic operations, and collection iteration), conditional evaluation to
 * control callflow execution based on variable values, and logging/tracing
 * statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted. If no "true"
 * conditions are encountered, then all data actions will be executed/evaluated
 * and the application will proceed to the "Default" servlet. Last generated by
 * Orchestration Designer at: 2022-DEC-08 03:05:08 PM
 */
public class DeleteBkFromDB extends com.avaya.sce.runtime.Data {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-08
	 * 03:05:08 PM
	 */
	public DeleteBkFromDB() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-05  05:47:19 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = null;
		return next;
	}

	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-05  05:47:19 PM
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}

	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-05  05:47:19 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "validation:isValidBookingNo", com.avaya.sce.runtime.Expression.STRING_EQUAL, "true", false).setDebugId(325)).evaluate(mySession)) {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("CancelBookingSuccess", "success").setDebugId(328));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("BookingCancelFailed", "failed").setDebugId(320));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}

	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_WARN, "DeleteBkFromDB Node ", mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties File started", mySession);
		String path = "D:\\AVAYA Project\\Speech_Testing\\data\\Database.properties";
		String DBUrl, DBDriver, DBUserName, DBPassword;
		try {
			FileInputStream fileInput = new FileInputStream(new File(path));
			Properties properties = new Properties();
			properties.load(fileInput);
			DBUrl = properties.getProperty("database.url");
			DBDriver = properties.getProperty("database.driverClassName");
			DBUserName = properties.getProperty("database.username");
			DBPassword = properties.getProperty("database.password");
			fileInput.close();
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
					"\nDatas : " + DBUrl + " " + DBDriver + " " + DBUserName + " " + DBPassword, mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties File Ended", mySession);

			dbOperation(DBUrl, DBDriver, DBUserName, DBPassword, mySession);

		} catch (FileNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties Failed : FileNotFound" + e.getMessage(),
					mySession);
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties Failed : IOException" + e.getMessage(),
					mySession);
			e.printStackTrace();
		}
	}

	private void dbOperation(String DBUrl, String DBDriver, String DBUserName, String DBPassword,
			SCESession mySession) {
		try {
			Class.forName(DBDriver);
			Connection connection = DriverManager.getConnection(DBUrl, DBUserName, DBPassword);
			Statement stmt = connection.createStatement();
			int userEnteredBkNo = mySession.getVariableField(IProjectVariables.BOOKING_DETAILS,
					IProjectVariables.BOOKING_DETAILS_FIELD_BOOKING_NO).getIntValue();
			stmt.executeUpdate("exec SUSEENDHIRAN_HOTEL_TABLE_BOOKING_DEL_BK_DETAILS " + userEnteredBkNo);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Booking Details Deleted Successfully: " + userEnteredBkNo,
					mySession);
//			mySession.getVariableField(IProjectVariables.VALIDATION,
//					IProjectVariables.VALIDATION_FIELD_DELETE_SUCCESS).setValue("true");
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Unable to Connect Database" + e.getMessage(), mySession);
		} catch (ClassNotFoundException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,
					"Unable to Connect Database - ClassNotFoundException" + e.getMessage(), mySession);
		} catch (Exception e) { 
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,
					"Exception Occured" + e.getMessage(), mySession);
		}
	}
}
