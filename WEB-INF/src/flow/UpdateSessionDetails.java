package flow;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

import hotel.table.booking.DateTimeValidation;
import hotel.table.booking.configuration.ConnectionPooling;

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
 * Orchestration Designer at: 2023-JAN-10 12:09:31 PM
 */
public class UpdateSessionDetails extends com.avaya.sce.runtime.Data {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2023-JAN-10
	 * 12:09:31 PM
	 */
	public UpdateSessionDetails() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution to the next
	 * form in the call flow. Last generated by Orchestration Designer at:
	 * 2023-JAN-10 12:10:24 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("Exit", "Default");
		next.setDebugId(728);
		return next;
	}

	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator and should not
	 * be manually edited. Manual edits may be overwritten by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-10 12:10:24 PM
	 */
	public java.util.Collection<VariableInfo> getLocalVariables() {
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}

	/**
	 * Creates and conditionally executes operations that have been configured in
	 * the Callflow. This method will build a collection of operations and have the
	 * framework execute the operations by calling evaluateActions(). If the
	 * evaluation causes the framework to forward to a different servlet then
	 * execution stops. Returning true from this method means that the framework has
	 * forwarded the request to a different servlet. Returning false means that the
	 * default Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator and should not
	 * be manually edited. Manual edits may be overwritten by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-10 12:10:24 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		if (evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or
		// redirect
		return false;
	}

	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "UpdateSessionDetails Node", mySession);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String startDate = mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
				IProjectVariables.CALL_HISTORY_INFO_FIELD_START_DATE).getStringValue();
		String endDate = now.format(format);

		mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
				IProjectVariables.CALL_HISTORY_INFO_FIELD_END_DATE).setValue(endDate);
		mySession
				.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
						IProjectVariables.CALL_HISTORY_INFO_FIELD_DURATION)
				.setValue(new DateTimeValidation(mySession).getDuration(startDate, endDate));

		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "----------------Flow Summary----------------", mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "UCID: " + mySession
				.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_UCID).getStringValue(),
				mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "CLID: " + mySession
				.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_ANI).getStringValue(),
				mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Flow Name: " + "HotelTableBooking", mySession);

		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "DNIS: " + mySession
				.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_DNIS).getStringValue(),
				mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
				"SESSION ID: " + mySession
						.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_SESSIONID)
						.getStringValue(),
				mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
				"Start Date: " + mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
						IProjectVariables.CALL_HISTORY_INFO_FIELD_START_DATE).getStringValue(),
				mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
				"End Date: " + mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
						IProjectVariables.CALL_HISTORY_INFO_FIELD_END_DATE).getStringValue(),
				mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
				"Duration: " + mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
						IProjectVariables.CALL_HISTORY_INFO_FIELD_DURATION).getStringValue(),
				mySession);
		TraceInfo
				.trace(ITraceInfo.TRACE_LEVEL_INFO,
						"Exit Location: "
								+ mySession
										.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
												IProjectVariables.CALL_HISTORY_INFO_FIELD_EXIT_LOCATION)
										.getStringValue(),
						mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
				"End Reason: " + mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
						IProjectVariables.CALL_HISTORY_INFO_FIELD_END_REASON).getStringValue(),
				mySession);

		ConnectionPooling cp = new ConnectionPooling(mySession);

		try {
			cp.uploadDetails(queryGenerate(mySession));
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Exception Occured " + e.toString(), mySession);
		}
	}

	private String queryGenerate(SCESession mySession) {

		String ucid = mySession.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_UCID)
				.getStringValue();

		int clid = mySession.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_ANI)
				.getIntValue();
		String flow_name = "HotelTableBooking";

		int dnis = mySession.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_DNIS)
				.getIntValue();
		String session_id = mySession
				.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_SESSIONID)
				.getStringValue();

		String start_date = mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
				IProjectVariables.CALL_HISTORY_INFO_FIELD_START_DATE).getStringValue();

		String end_date = mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
				IProjectVariables.CALL_HISTORY_INFO_FIELD_END_DATE).getStringValue();

		int duration = mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
				IProjectVariables.CALL_HISTORY_INFO_FIELD_DURATION).getIntValue();

		String exit_location = mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
				IProjectVariables.CALL_HISTORY_INFO_FIELD_EXIT_LOCATION).getStringValue();

		String end_reason = mySession.getVariableField(IProjectVariables.CALL_HISTORY_INFO,
				IProjectVariables.CALL_HISTORY_INFO_FIELD_END_REASON).getStringValue();

		String app_ip = mySession
				.getVariableField(IProjectVariables.CALL_HISTORY_INFO, IProjectVariables.CALL_HISTORY_INFO_FIELD_IP)
				.getStringValue();

		String query = "Exec Hotel_InsertCallHistory @ucid = '" + ucid + "' ,@flow_name = '" + flow_name + "', @clid = "
				+ clid + ", @dnis = " + dnis + ", @session_id = '" + session_id + "', @start_date = '" + start_date
				+ "',@end_date = '" + end_date + "', @duration = " + duration + ",@exit_location = '" + exit_location
				+ "',@end_reason = '" + end_reason + "',@app_ip = '" + app_ip + "';";

		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_DEBUG, query, mySession);
		return query;
	}
}
